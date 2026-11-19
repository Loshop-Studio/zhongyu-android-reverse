.class public Lcom/tendcloud/tenddata/by;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/tendcloud/tenddata/by;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Z

.field public b:I

.field public final c:Ljava/lang/String;

.field public final d:I

.field private final f:Lcom/tendcloud/tenddata/cf$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tendcloud/tenddata/by$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tendcloud/tenddata/by$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tendcloud/tenddata/by;->e:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(I)V
    .locals 4

    .line 1
    const-string v0, "/"

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/tendcloud/tenddata/by;->d:I

    .line 3
    invoke-static {p1}, Lcom/tendcloud/tenddata/by;->a(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tendcloud/tenddata/by;->c:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/tendcloud/tenddata/cf$a;->get(I)Lcom/tendcloud/tenddata/cf$a;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/by;->f:Lcom/tendcloud/tenddata/cf$a;

    .line 5
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/by;->d()Lcom/tendcloud/tenddata/cf$d;

    move-result-object v1

    if-eqz p1, :cond_2

    .line 6
    :try_start_0
    const-string v2, "cpuacct"

    invoke-virtual {p1, v2}, Lcom/tendcloud/tenddata/cf$a;->getGroup(Ljava/lang/String;)Lcom/tendcloud/tenddata/cf$b;

    move-result-object v2

    .line 7
    const-string v3, "cpu"

    invoke-virtual {p1, v3}, Lcom/tendcloud/tenddata/cf$a;->getGroup(Ljava/lang/String;)Lcom/tendcloud/tenddata/cf$b;

    move-result-object p1

    .line 8
    iget-object p1, p1, Lcom/tendcloud/tenddata/cf$b;->group:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 9
    const-string v3, "bg_non_interactive"

    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v3, 0x1

    xor-int/2addr p1, v3

    iput-boolean p1, p0, Lcom/tendcloud/tenddata/by;->a:Z

    .line 10
    iget-object p1, v2, Lcom/tendcloud/tenddata/cf$b;->group:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length p1, p1

    if-le p1, v3, :cond_0

    .line 11
    iget-object p1, v2, Lcom/tendcloud/tenddata/cf$b;->group:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, v3

    const-string v0, "uid_"

    const-string v2, ""

    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/tendcloud/tenddata/by;->b:I

    return-void

    :cond_0
    if-eqz v1, :cond_2

    .line 12
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/cf$d;->getUid()I

    move-result p1

    iput p1, p0, Lcom/tendcloud/tenddata/by;->b:I

    return-void

    :cond_1
    if-eqz v1, :cond_2

    .line 13
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/cf$d;->getUid()I

    move-result p1

    iput p1, p0, Lcom/tendcloud/tenddata/by;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    if-eqz v1, :cond_2

    .line 14
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/cf$d;->getUid()I

    move-result p1

    iput p1, p0, Lcom/tendcloud/tenddata/by;->b:I

    :cond_2
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/by;->c:Ljava/lang/String;

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/tendcloud/tenddata/by;->d:I

    .line 18
    const-class v0, Lcom/tendcloud/tenddata/cf$a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/tendcloud/tenddata/cf$a;

    iput-object v0, p0, Lcom/tendcloud/tenddata/by;->f:Lcom/tendcloud/tenddata/cf$a;

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/tendcloud/tenddata/by;->a:Z

    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    .line 3
    :try_start_0
    const-string v1, "/proc/%d/cmdline"

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/tendcloud/tenddata/cf;->readFile(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/cf$c;->get(I)Lcom/tendcloud/tenddata/cf$c;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/cf$c;->getComm()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/by;->c:Ljava/lang/String;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 2
    :catchall_0
    const-string v0, ""

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ":"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/tendcloud/tenddata/by;->c:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    array-length v1, v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-le v1, v2, :cond_0

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, Lcom/tendcloud/tenddata/by;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    aget-object v0, v0, v2

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    return-object v0

    .line 37
    :catchall_0
    :cond_0
    const-string v0, ""

    .line 38
    .line 39
    return-object v0
.end method

.method public c()Lcom/tendcloud/tenddata/cf$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/by;->f:Lcom/tendcloud/tenddata/cf$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lcom/tendcloud/tenddata/cf$d;
    .locals 1

    .line 1
    :try_start_0
    iget v0, p0, Lcom/tendcloud/tenddata/by;->d:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/cf$d;->get(I)Lcom/tendcloud/tenddata/cf$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    return-object v0

    .line 8
    :catchall_0
    const/4 v0, 0x0

    .line 9
    return-object v0
.end method

.method public e()Lcom/tendcloud/tenddata/cf$c;
    .locals 1

    .line 1
    :try_start_0
    iget v0, p0, Lcom/tendcloud/tenddata/by;->d:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/cf$c;->get(I)Lcom/tendcloud/tenddata/cf$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    return-object v0

    .line 8
    :catchall_0
    const/4 v0, 0x0

    .line 9
    return-object v0
.end method
