.class public final Ls5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Lx7/a;

.field public c:Lx7/a;

.field public d:Z

.field public e:Lx7/a;

.field public f:Ljava/util/List;

.field public g:Lx7/a;

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>(ZLx7/a;Lx7/a;ZLx7/a;Ljava/util/List;Lx7/a;Ls5/b;ZZ)V
    .locals 0

    const-string p8, "extrasForSetting"

    invoke-static {p6, p8}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Ls5/a;->a:Z

    .line 3
    iput-object p2, p0, Ls5/a;->b:Lx7/a;

    .line 4
    iput-object p3, p0, Ls5/a;->c:Lx7/a;

    .line 5
    iput-boolean p4, p0, Ls5/a;->d:Z

    .line 6
    iput-object p5, p0, Ls5/a;->e:Lx7/a;

    .line 7
    iput-object p6, p0, Ls5/a;->f:Ljava/util/List;

    .line 8
    iput-object p7, p0, Ls5/a;->g:Lx7/a;

    .line 9
    iput-boolean p9, p0, Ls5/a;->h:Z

    .line 10
    iput-boolean p10, p0, Ls5/a;->i:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLx7/a;Lx7/a;ZLx7/a;Ljava/util/List;Lx7/a;Ls5/b;ZZILkotlin/jvm/internal/n;)V
    .locals 2

    and-int/lit8 p12, p11, 0x1

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p12, p11, 0x2

    const/4 v1, 0x0

    if-eqz p12, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    move-object p3, v1

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    move-object p5, v1

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    .line 11
    new-instance p6, Ljava/util/ArrayList;

    invoke-direct {p6}, Ljava/util/ArrayList;-><init>()V

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    move-object p7, v1

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    move-object p8, v1

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    move p9, v0

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    move p11, v0

    :goto_0
    move p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_9
    move p11, p10

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p11}, Ls5/a;-><init>(ZLx7/a;Lx7/a;ZLx7/a;Ljava/util/List;Lx7/a;Ls5/b;ZZ)V

    return-void
.end method


# virtual methods
.method public final a()Lx7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ls5/a;->b:Lx7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lx7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ls5/a;->e:Lx7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lx7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ls5/a;->c:Lx7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ls5/a;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ls5/a;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ls5/a;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ls5/a;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final h()Ls5/b;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ls5/a;->i:Z

    .line 2
    .line 3
    return v0
.end method
