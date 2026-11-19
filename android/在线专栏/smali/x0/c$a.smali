.class public final Lx0/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:Z

.field c:Lx0/o;

.field d:Z

.field e:Z

.field f:J

.field g:J

.field h:Lx0/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lx0/c$a;->a:Z

    .line 3
    iput-boolean v0, p0, Lx0/c$a;->b:Z

    .line 4
    sget-object v1, Lx0/o;->a:Lx0/o;

    iput-object v1, p0, Lx0/c$a;->c:Lx0/o;

    .line 5
    iput-boolean v0, p0, Lx0/c$a;->d:Z

    .line 6
    iput-boolean v0, p0, Lx0/c$a;->e:Z

    const-wide/16 v0, -0x1

    .line 7
    iput-wide v0, p0, Lx0/c$a;->f:J

    .line 8
    iput-wide v0, p0, Lx0/c$a;->g:J

    .line 9
    new-instance v0, Lx0/d;

    invoke-direct {v0}, Lx0/d;-><init>()V

    iput-object v0, p0, Lx0/c$a;->h:Lx0/d;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;Z)Lx0/c$a;
    .locals 1

    iget-object v0, p0, Lx0/c$a;->h:Lx0/d;

    invoke-virtual {v0, p1, p2}, Lx0/d;->a(Landroid/net/Uri;Z)V

    return-object p0
.end method

.method public b()Lx0/c;
    .locals 1

    new-instance v0, Lx0/c;

    invoke-direct {v0, p0}, Lx0/c;-><init>(Lx0/c$a;)V

    return-object v0
.end method

.method public c(Lx0/o;)Lx0/c$a;
    .locals 0

    iput-object p1, p0, Lx0/c$a;->c:Lx0/o;

    return-object p0
.end method

.method public d(Z)Lx0/c$a;
    .locals 0

    iput-boolean p1, p0, Lx0/c$a;->d:Z

    return-object p0
.end method

.method public e(Z)Lx0/c$a;
    .locals 0

    iput-boolean p1, p0, Lx0/c$a;->a:Z

    return-object p0
.end method

.method public f(Z)Lx0/c$a;
    .locals 0

    iput-boolean p1, p0, Lx0/c$a;->b:Z

    return-object p0
.end method

.method public g(Z)Lx0/c$a;
    .locals 0

    iput-boolean p1, p0, Lx0/c$a;->e:Z

    return-object p0
.end method

.method public h(JLjava/util/concurrent/TimeUnit;)Lx0/c$a;
    .locals 0

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    iput-wide p1, p0, Lx0/c$a;->g:J

    return-object p0
.end method

.method public i(JLjava/util/concurrent/TimeUnit;)Lx0/c$a;
    .locals 0

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    iput-wide p1, p0, Lx0/c$a;->f:J

    return-object p0
.end method
