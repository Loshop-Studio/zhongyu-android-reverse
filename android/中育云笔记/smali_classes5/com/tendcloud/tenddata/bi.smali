.class public Lcom/tendcloud/tenddata/bi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/bg;


# static fields
.field protected static a_:[B


# instance fields
.field protected b_:Z

.field protected c_:Lcom/tendcloud/tenddata/bh$a;

.field protected d_:Z

.field private e:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, Lcom/tendcloud/tenddata/bi;->a_:[B

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/tendcloud/tenddata/bh$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/tendcloud/tenddata/bi;->c_:Lcom/tendcloud/tenddata/bh$a;

    .line 4
    sget-object p1, Lcom/tendcloud/tenddata/bi;->a_:[B

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public constructor <init>(Lcom/tendcloud/tenddata/bh;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bh;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/tendcloud/tenddata/bi;->b_:Z

    .line 7
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bh;->f()Lcom/tendcloud/tenddata/bh$a;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/bi;->c_:Lcom/tendcloud/tenddata/bh$a;

    .line 8
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bh;->c()Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 9
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bh;->e()Z

    move-result p1

    iput-boolean p1, p0, Lcom/tendcloud/tenddata/bi;->d_:Z

    return-void
.end method


# virtual methods
.method public append(Lcom/tendcloud/tenddata/bh;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bh;->c()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iget-object v2, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-le v1, v2, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iget-object v2, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    add-int/2addr v1, v2

    .line 75
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-object v2, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 85
    .line 86
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    .line 92
    iput-object v1, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    iget-object v1, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 98
    .line 99
    .line 100
    :goto_0
    iget-object v1, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 106
    .line 107
    .line 108
    :goto_1
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bh;->d()Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    iput-boolean p1, p0, Lcom/tendcloud/tenddata/bi;->b_:Z

    .line 113
    .line 114
    return-void
.end method

.method public c()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tendcloud/tenddata/bi;->b_:Z

    .line 2
    .line 3
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tendcloud/tenddata/bi;->d_:Z

    .line 2
    .line 3
    return v0
.end method

.method public f()Lcom/tendcloud/tenddata/bh$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bi;->c_:Lcom/tendcloud/tenddata/bh$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public setFin(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tendcloud/tenddata/bi;->b_:Z

    .line 2
    .line 3
    return-void
.end method

.method public setOptcode(Lcom/tendcloud/tenddata/bh$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/bi;->c_:Lcom/tendcloud/tenddata/bh$a;

    .line 2
    .line 3
    return-void
.end method

.method public setPayload(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    return-void
.end method

.method public setTransferemasked(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tendcloud/tenddata/bi;->d_:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Framedata{ optcode:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/bi;->f()Lcom/tendcloud/tenddata/bh$a;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ", fin:"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/bi;->d()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", payloadlength:[pos:"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", len:"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, "], payload:"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    new-instance v1, Ljava/lang/String;

    .line 64
    .line 65
    iget-object v2, p0, Lcom/tendcloud/tenddata/bi;->e:Ljava/nio/ByteBuffer;

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Lcom/tendcloud/tenddata/bw;->a(Ljava/lang/String;)[B

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, "}"

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0
.end method
