.class public Lx2/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static volatile j:Lx2/b$b;

.field public static final k:Landroid/graphics/Typeface;


# instance fields
.field public a:Landroid/graphics/Typeface;

.field public b:I

.field public c:Z

.field public d:Z

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "sans-serif-condensed"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lx2/b$b;->k:Landroid/graphics/Typeface;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lx2/b$b;->k:Landroid/graphics/Typeface;

    .line 5
    .line 6
    iput-object v0, p0, Lx2/b$b;->a:Landroid/graphics/Typeface;

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lx2/b$b;->b:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, Lx2/b$b;->c:Z

    .line 13
    .line 14
    iput-boolean v1, p0, Lx2/b$b;->d:Z

    .line 15
    .line 16
    iput v0, p0, Lx2/b$b;->e:I

    .line 17
    .line 18
    iput v0, p0, Lx2/b$b;->f:I

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lx2/b$b;->g:I

    .line 22
    .line 23
    iput v0, p0, Lx2/b$b;->h:I

    .line 24
    .line 25
    iput-boolean v0, p0, Lx2/b$b;->i:Z

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic a(Lx2/b$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lx2/b$b;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Lx2/b$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lx2/b$b;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic c(Lx2/b$b;)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    iget-object p0, p0, Lx2/b$b;->a:Landroid/graphics/Typeface;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lx2/b$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lx2/b$b;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Lx2/b$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lx2/b$b;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Lx2/b$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lx2/b$b;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic g(Lx2/b$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lx2/b$b;->g:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic h(Lx2/b$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lx2/b$b;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic i(Lx2/b$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lx2/b$b;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public static k()Lx2/b$b;
    .locals 2

    .line 1
    sget-object v0, Lx2/b$b;->j:Lx2/b$b;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lx2/b$b;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lx2/b$b;->j:Lx2/b$b;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lx2/b$b;

    .line 13
    .line 14
    invoke-direct {v1}, Lx2/b$b;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lx2/b$b;->j:Lx2/b$b;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_2
    sget-object v0, Lx2/b$b;->j:Lx2/b$b;

    .line 27
    .line 28
    return-object v0
.end method


# virtual methods
.method public j(Z)Lx2/b$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lx2/b$b;->d:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public l(I)Lx2/b$b;
    .locals 0

    .line 1
    iput p1, p0, Lx2/b$b;->e:I

    .line 2
    .line 3
    return-object p0
.end method

.method public m(I)Lx2/b$b;
    .locals 0

    .line 1
    iput p1, p0, Lx2/b$b;->f:I

    .line 2
    .line 3
    return-object p0
.end method

.method public n(Landroid/graphics/Typeface;)Lx2/b$b;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lx2/b$b;->a:Landroid/graphics/Typeface;

    .line 4
    .line 5
    :cond_0
    return-object p0
.end method
