.class public Ld0/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld0/a$d;,
        Ld0/a$e;,
        Ld0/a$b;,
        Ld0/a$c;
    }
.end annotation


# static fields
.field public static final h:Lcom/alibaba/sdk/android/logger/LogLevel;

.field public static final i:Ld0/c;


# instance fields
.field public a:Z

.field public b:Lcom/alibaba/sdk/android/logger/LogLevel;

.field public c:Ld0/c;

.field public d:Ljava/util/ArrayList;

.field public e:Ld0/a$c;

.field public f:Ljava/lang/String;

.field public g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/alibaba/sdk/android/logger/LogLevel;->c:Lcom/alibaba/sdk/android/logger/LogLevel;

    .line 2
    .line 3
    sput-object v0, Ld0/a;->h:Lcom/alibaba/sdk/android/logger/LogLevel;

    .line 4
    .line 5
    new-instance v0, Ld0/a$d;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, Ld0/a$d;-><init>(Ld0/a$a;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Ld0/a;->i:Ld0/c;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Ld0/a;->a:Z

    .line 6
    .line 7
    sget-object v0, Ld0/a;->h:Lcom/alibaba/sdk/android/logger/LogLevel;

    .line 8
    .line 9
    iput-object v0, p0, Ld0/a;->b:Lcom/alibaba/sdk/android/logger/LogLevel;

    .line 10
    .line 11
    sget-object v0, Ld0/a;->i:Ld0/c;

    .line 12
    .line 13
    iput-object v0, p0, Ld0/a;->c:Ld0/c;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Ld0/a;->d:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance v0, Ld0/a$c;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, v1}, Ld0/a$c;-><init>(Ld0/a;Ld0/a$a;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Ld0/a;->e:Ld0/a$c;

    .line 29
    .line 30
    iput-object p1, p0, Ld0/a;->f:Ljava/lang/String;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    const-string p1, "default"

    .line 35
    .line 36
    iput-object p1, p0, Ld0/a;->f:Ljava/lang/String;

    .line 37
    .line 38
    :cond_0
    iput-boolean p2, p0, Ld0/a;->g:Z

    .line 39
    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    sget-object p1, Lcom/alibaba/sdk/android/logger/LogLevel;->a:Lcom/alibaba/sdk/android/logger/LogLevel;

    .line 43
    .line 44
    iput-object p1, p0, Ld0/a;->b:Lcom/alibaba/sdk/android/logger/LogLevel;

    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public static synthetic a(Ld0/a;)Ld0/c;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/a;->c:Ld0/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Ld0/a;Lcom/alibaba/sdk/android/logger/LogLevel;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ld0/a;->c(Lcom/alibaba/sdk/android/logger/LogLevel;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic e(Ld0/a;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/a;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    instance-of v0, p1, Ljava/lang/Class;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Class;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    instance-of v0, p1, Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    check-cast p1, Ljava/lang/String;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, "@"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Ld0/a;->f:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, "_"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1
.end method

.method public final c(Lcom/alibaba/sdk/android/logger/LogLevel;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ld0/a;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v0, p0, Ld0/a;->b:Lcom/alibaba/sdk/android/logger/LogLevel;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lt p1, v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public f(Ljava/lang/Object;)Ld0/b;
    .locals 5

    .line 1
    new-instance v0, Ld0/a$e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ld0/a;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Ld0/a$b;

    .line 8
    .line 9
    iget-object v2, p0, Ld0/a;->e:Ld0/a$c;

    .line 10
    .line 11
    iget-boolean v3, p0, Ld0/a;->g:Z

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-direct {v1, v2, v3, v4}, Ld0/a$b;-><init>(Ld0/c;ZLd0/a$a;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p1, v1}, Ld0/a$e;-><init>(Ljava/lang/String;Ld0/c;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public g(Lcom/alibaba/sdk/android/logger/LogLevel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/a;->b:Lcom/alibaba/sdk/android/logger/LogLevel;

    .line 2
    .line 3
    return-void
.end method
