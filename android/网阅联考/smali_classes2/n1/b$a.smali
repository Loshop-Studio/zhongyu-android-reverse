.class public Ln1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static volatile i:Ln1/b$a;

.field public static final j:Landroid/graphics/Typeface;


# instance fields
.field public a:Landroid/graphics/Typeface;

.field public b:I

.field public c:Z

.field public d:Z

.field public e:I

.field public f:I

.field public g:I

.field public h:I


# direct methods
.method public static constructor <clinit>()V
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
    sput-object v0, Ln1/b$a;->j:Landroid/graphics/Typeface;

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
    sget-object v0, Ln1/b$a;->j:Landroid/graphics/Typeface;

    .line 5
    .line 6
    iput-object v0, p0, Ln1/b$a;->a:Landroid/graphics/Typeface;

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Ln1/b$a;->b:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, Ln1/b$a;->c:Z

    .line 13
    .line 14
    iput-boolean v1, p0, Ln1/b$a;->d:Z

    .line 15
    .line 16
    iput v0, p0, Ln1/b$a;->e:I

    .line 17
    .line 18
    iput v0, p0, Ln1/b$a;->f:I

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput v0, p0, Ln1/b$a;->g:I

    .line 22
    .line 23
    iput v0, p0, Ln1/b$a;->h:I

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic a(Ln1/b$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ln1/b$a;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Ln1/b$a;)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    iget-object p0, p0, Ln1/b$a;->a:Landroid/graphics/Typeface;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Ln1/b$a;)I
    .locals 0

    .line 1
    iget p0, p0, Ln1/b$a;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Ln1/b$a;)I
    .locals 0

    .line 1
    iget p0, p0, Ln1/b$a;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Ln1/b$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ln1/b$a;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Ln1/b$a;)I
    .locals 0

    .line 1
    iget p0, p0, Ln1/b$a;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic g(Ln1/b$a;)I
    .locals 0

    .line 1
    iget p0, p0, Ln1/b$a;->g:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic h(Ln1/b$a;)I
    .locals 0

    .line 1
    iget p0, p0, Ln1/b$a;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public static j()Ln1/b$a;
    .locals 2

    .line 1
    sget-object v0, Ln1/b$a;->i:Ln1/b$a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Ln1/b$a;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Ln1/b$a;->i:Ln1/b$a;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ln1/b$a;

    .line 13
    .line 14
    invoke-direct {v1}, Ln1/b$a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Ln1/b$a;->i:Ln1/b$a;

    .line 18
    .line 19
    :cond_0
    monitor-exit v0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1

    .line 24
    :cond_1
    :goto_0
    sget-object v0, Ln1/b$a;->i:Ln1/b$a;

    .line 25
    .line 26
    return-object v0
.end method


# virtual methods
.method public i(Z)Ln1/b$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Ln1/b$a;->d:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public k(I)Ln1/b$a;
    .locals 0

    .line 1
    iput p1, p0, Ln1/b$a;->e:I

    .line 2
    .line 3
    return-object p0
.end method

.method public l(I)Ln1/b$a;
    .locals 0

    .line 1
    iput p1, p0, Ln1/b$a;->f:I

    .line 2
    .line 3
    return-object p0
.end method
