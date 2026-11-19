.class public final Lx0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/c$a;
    }
.end annotation


# static fields
.field public static final i:Lx0/c;


# instance fields
.field private a:Lx0/o;

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:J

.field private g:J

.field private h:Lx0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx0/c$a;

    invoke-direct {v0}, Lx0/c$a;-><init>()V

    invoke-virtual {v0}, Lx0/c$a;->b()Lx0/c;

    move-result-object v0

    sput-object v0, Lx0/c;->i:Lx0/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lx0/o;->a:Lx0/o;

    iput-object v0, p0, Lx0/c;->a:Lx0/o;

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, p0, Lx0/c;->f:J

    .line 4
    iput-wide v0, p0, Lx0/c;->g:J

    .line 5
    new-instance v0, Lx0/d;

    invoke-direct {v0}, Lx0/d;-><init>()V

    iput-object v0, p0, Lx0/c;->h:Lx0/d;

    return-void
.end method

.method constructor <init>(Lx0/c$a;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    sget-object v0, Lx0/o;->a:Lx0/o;

    iput-object v0, p0, Lx0/c;->a:Lx0/o;

    const-wide/16 v0, -0x1

    .line 8
    iput-wide v0, p0, Lx0/c;->f:J

    .line 9
    iput-wide v0, p0, Lx0/c;->g:J

    .line 10
    new-instance v0, Lx0/d;

    invoke-direct {v0}, Lx0/d;-><init>()V

    iput-object v0, p0, Lx0/c;->h:Lx0/d;

    .line 11
    iget-boolean v0, p1, Lx0/c$a;->a:Z

    iput-boolean v0, p0, Lx0/c;->b:Z

    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    iget-boolean v1, p1, Lx0/c$a;->b:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lx0/c;->c:Z

    .line 13
    iget-object v1, p1, Lx0/c$a;->c:Lx0/o;

    iput-object v1, p0, Lx0/c;->a:Lx0/o;

    .line 14
    iget-boolean v1, p1, Lx0/c$a;->d:Z

    iput-boolean v1, p0, Lx0/c;->d:Z

    .line 15
    iget-boolean v1, p1, Lx0/c$a;->e:Z

    iput-boolean v1, p0, Lx0/c;->e:Z

    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    .line 16
    iget-object v0, p1, Lx0/c$a;->h:Lx0/d;

    iput-object v0, p0, Lx0/c;->h:Lx0/d;

    .line 17
    iget-wide v0, p1, Lx0/c$a;->f:J

    iput-wide v0, p0, Lx0/c;->f:J

    .line 18
    iget-wide v0, p1, Lx0/c$a;->g:J

    iput-wide v0, p0, Lx0/c;->g:J

    :cond_1
    return-void
.end method

.method public constructor <init>(Lx0/c;)V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    sget-object v0, Lx0/o;->a:Lx0/o;

    iput-object v0, p0, Lx0/c;->a:Lx0/o;

    const-wide/16 v0, -0x1

    .line 21
    iput-wide v0, p0, Lx0/c;->f:J

    .line 22
    iput-wide v0, p0, Lx0/c;->g:J

    .line 23
    new-instance v0, Lx0/d;

    invoke-direct {v0}, Lx0/d;-><init>()V

    iput-object v0, p0, Lx0/c;->h:Lx0/d;

    .line 24
    iget-boolean v0, p1, Lx0/c;->b:Z

    iput-boolean v0, p0, Lx0/c;->b:Z

    .line 25
    iget-boolean v0, p1, Lx0/c;->c:Z

    iput-boolean v0, p0, Lx0/c;->c:Z

    .line 26
    iget-object v0, p1, Lx0/c;->a:Lx0/o;

    iput-object v0, p0, Lx0/c;->a:Lx0/o;

    .line 27
    iget-boolean v0, p1, Lx0/c;->d:Z

    iput-boolean v0, p0, Lx0/c;->d:Z

    .line 28
    iget-boolean v0, p1, Lx0/c;->e:Z

    iput-boolean v0, p0, Lx0/c;->e:Z

    .line 29
    iget-object p1, p1, Lx0/c;->h:Lx0/d;

    iput-object p1, p0, Lx0/c;->h:Lx0/d;

    return-void
.end method


# virtual methods
.method public a()Lx0/d;
    .locals 1

    iget-object v0, p0, Lx0/c;->h:Lx0/d;

    return-object v0
.end method

.method public b()Lx0/o;
    .locals 1

    iget-object v0, p0, Lx0/c;->a:Lx0/o;

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lx0/c;->f:J

    return-wide v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lx0/c;->g:J

    return-wide v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lx0/c;->h:Lx0/d;

    invoke-virtual {v0}, Lx0/d;->c()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_9

    .line 1
    const-class v1, Lx0/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 2
    :cond_1
    check-cast p1, Lx0/c;

    .line 3
    iget-boolean v1, p0, Lx0/c;->b:Z

    iget-boolean v2, p1, Lx0/c;->b:Z

    if-eq v1, v2, :cond_2

    return v0

    .line 4
    :cond_2
    iget-boolean v1, p0, Lx0/c;->c:Z

    iget-boolean v2, p1, Lx0/c;->c:Z

    if-eq v1, v2, :cond_3

    return v0

    .line 5
    :cond_3
    iget-boolean v1, p0, Lx0/c;->d:Z

    iget-boolean v2, p1, Lx0/c;->d:Z

    if-eq v1, v2, :cond_4

    return v0

    .line 6
    :cond_4
    iget-boolean v1, p0, Lx0/c;->e:Z

    iget-boolean v2, p1, Lx0/c;->e:Z

    if-eq v1, v2, :cond_5

    return v0

    .line 7
    :cond_5
    iget-wide v1, p0, Lx0/c;->f:J

    iget-wide v3, p1, Lx0/c;->f:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_6

    return v0

    .line 8
    :cond_6
    iget-wide v1, p0, Lx0/c;->g:J

    iget-wide v3, p1, Lx0/c;->g:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_7

    return v0

    .line 9
    :cond_7
    iget-object v1, p0, Lx0/c;->a:Lx0/o;

    iget-object v2, p1, Lx0/c;->a:Lx0/o;

    if-eq v1, v2, :cond_8

    return v0

    .line 10
    :cond_8
    iget-object v0, p0, Lx0/c;->h:Lx0/d;

    iget-object p1, p1, Lx0/c;->h:Lx0/d;

    invoke-virtual {v0, p1}, Lx0/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_9
    :goto_0
    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lx0/c;->d:Z

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lx0/c;->b:Z

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lx0/c;->c:Z

    return v0
.end method

.method public hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Lx0/c;->a:Lx0/o;

    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 2
    iget-boolean v1, p0, Lx0/c;->b:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 3
    iget-boolean v1, p0, Lx0/c;->c:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 4
    iget-boolean v1, p0, Lx0/c;->d:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 5
    iget-boolean v1, p0, Lx0/c;->e:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 6
    iget-wide v1, p0, Lx0/c;->f:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 7
    iget-wide v1, p0, Lx0/c;->g:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 8
    iget-object v1, p0, Lx0/c;->h:Lx0/d;

    invoke-virtual {v1}, Lx0/d;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lx0/c;->e:Z

    return v0
.end method

.method public j(Lx0/d;)V
    .locals 0

    iput-object p1, p0, Lx0/c;->h:Lx0/d;

    return-void
.end method

.method public k(Lx0/o;)V
    .locals 0

    iput-object p1, p0, Lx0/c;->a:Lx0/o;

    return-void
.end method

.method public l(Z)V
    .locals 0

    iput-boolean p1, p0, Lx0/c;->d:Z

    return-void
.end method

.method public m(Z)V
    .locals 0

    iput-boolean p1, p0, Lx0/c;->b:Z

    return-void
.end method

.method public n(Z)V
    .locals 0

    iput-boolean p1, p0, Lx0/c;->c:Z

    return-void
.end method

.method public o(Z)V
    .locals 0

    iput-boolean p1, p0, Lx0/c;->e:Z

    return-void
.end method

.method public p(J)V
    .locals 0

    iput-wide p1, p0, Lx0/c;->f:J

    return-void
.end method

.method public q(J)V
    .locals 0

    iput-wide p1, p0, Lx0/c;->g:J

    return-void
.end method
