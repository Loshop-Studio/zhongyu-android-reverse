.class public Lm/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/d$a;,
        Lm/d$b;
    }
.end annotation


# static fields
.field private static q:I = 0x3e8

.field public static r:Z = true

.field public static s:J

.field public static t:J


# instance fields
.field a:I

.field private b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lm/i;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lm/d$a;

.field private d:I

.field private e:I

.field f:[Lm/b;

.field public g:Z

.field public h:Z

.field private i:[Z

.field j:I

.field k:I

.field private l:I

.field final m:Lm/c;

.field private n:[Lm/i;

.field private o:I

.field private p:Lm/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lm/d;->a:I

    const/4 v1, 0x0

    .line 3
    iput-object v1, p0, Lm/d;->b:Ljava/util/HashMap;

    const/16 v2, 0x20

    .line 4
    iput v2, p0, Lm/d;->d:I

    .line 5
    iput v2, p0, Lm/d;->e:I

    .line 6
    iput-object v1, p0, Lm/d;->f:[Lm/b;

    .line 7
    iput-boolean v0, p0, Lm/d;->g:Z

    .line 8
    iput-boolean v0, p0, Lm/d;->h:Z

    new-array v1, v2, [Z

    .line 9
    iput-object v1, p0, Lm/d;->i:[Z

    const/4 v1, 0x1

    .line 10
    iput v1, p0, Lm/d;->j:I

    .line 11
    iput v0, p0, Lm/d;->k:I

    .line 12
    iput v2, p0, Lm/d;->l:I

    .line 13
    sget v1, Lm/d;->q:I

    new-array v1, v1, [Lm/i;

    iput-object v1, p0, Lm/d;->n:[Lm/i;

    .line 14
    iput v0, p0, Lm/d;->o:I

    new-array v0, v2, [Lm/b;

    .line 15
    iput-object v0, p0, Lm/d;->f:[Lm/b;

    .line 16
    invoke-direct {p0}, Lm/d;->C()V

    .line 17
    new-instance v0, Lm/c;

    invoke-direct {v0}, Lm/c;-><init>()V

    iput-object v0, p0, Lm/d;->m:Lm/c;

    .line 18
    new-instance v1, Lm/h;

    invoke-direct {v1, v0}, Lm/h;-><init>(Lm/c;)V

    iput-object v1, p0, Lm/d;->c:Lm/d$a;

    .line 19
    sget-boolean v1, Lm/d;->r:Z

    if-eqz v1, :cond_0

    .line 20
    new-instance v1, Lm/d$b;

    invoke-direct {v1, p0, v0}, Lm/d$b;-><init>(Lm/d;Lm/c;)V

    iput-object v1, p0, Lm/d;->p:Lm/d$a;

    goto :goto_0

    .line 21
    :cond_0
    new-instance v1, Lm/b;

    invoke-direct {v1, v0}, Lm/b;-><init>(Lm/c;)V

    iput-object v1, p0, Lm/d;->p:Lm/d$a;

    :goto_0
    return-void
.end method

.method private final B(Lm/d$a;Z)I
    .locals 10

    const/4 p2, 0x0

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget v1, p0, Lm/d;->j:I

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lm/d;->i:[Z

    aput-boolean p2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_1
    :goto_1
    if-nez v0, :cond_b

    add-int/lit8 v1, v1, 0x1

    .line 3
    iget v2, p0, Lm/d;->j:I

    mul-int/lit8 v2, v2, 0x2

    if-lt v1, v2, :cond_2

    return v1

    .line 4
    :cond_2
    invoke-interface {p1}, Lm/d$a;->getKey()Lm/i;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    .line 5
    iget-object v2, p0, Lm/d;->i:[Z

    invoke-interface {p1}, Lm/d$a;->getKey()Lm/i;

    move-result-object v4

    iget v4, v4, Lm/i;->c:I

    aput-boolean v3, v2, v4

    .line 6
    :cond_3
    iget-object v2, p0, Lm/d;->i:[Z

    invoke-interface {p1, p0, v2}, Lm/d$a;->a(Lm/d;[Z)Lm/i;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 7
    iget-object v4, p0, Lm/d;->i:[Z

    iget v5, v2, Lm/i;->c:I

    aget-boolean v6, v4, v5

    if-eqz v6, :cond_4

    return v1

    .line 8
    :cond_4
    aput-boolean v3, v4, v5

    :cond_5
    if-eqz v2, :cond_a

    const v3, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, -0x1

    .line 9
    :goto_2
    iget v7, p0, Lm/d;->k:I

    if-ge v5, v7, :cond_9

    .line 10
    iget-object v7, p0, Lm/d;->f:[Lm/b;

    aget-object v7, v7, v5

    .line 11
    iget-object v8, v7, Lm/b;->a:Lm/i;

    .line 12
    iget-object v8, v8, Lm/i;->j:Lm/i$a;

    sget-object v9, Lm/i$a;->a:Lm/i$a;

    if-ne v8, v9, :cond_6

    goto :goto_3

    .line 13
    :cond_6
    iget-boolean v8, v7, Lm/b;->f:Z

    if-eqz v8, :cond_7

    goto :goto_3

    .line 14
    :cond_7
    invoke-virtual {v7, v2}, Lm/b;->t(Lm/i;)Z

    move-result v8

    if-eqz v8, :cond_8

    .line 15
    iget-object v8, v7, Lm/b;->e:Lm/b$a;

    invoke-interface {v8, v2}, Lm/b$a;->d(Lm/i;)F

    move-result v8

    const/4 v9, 0x0

    cmpg-float v9, v8, v9

    if-gez v9, :cond_8

    .line 16
    iget v7, v7, Lm/b;->b:F

    neg-float v7, v7

    div-float/2addr v7, v8

    cmpg-float v8, v7, v3

    if-gez v8, :cond_8

    move v6, v5

    move v3, v7

    :cond_8
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_9
    if-le v6, v4, :cond_1

    .line 17
    iget-object v3, p0, Lm/d;->f:[Lm/b;

    aget-object v3, v3, v6

    .line 18
    iget-object v5, v3, Lm/b;->a:Lm/i;

    iput v4, v5, Lm/i;->d:I

    .line 19
    invoke-virtual {v3, v2}, Lm/b;->y(Lm/i;)V

    .line 20
    iget-object v2, v3, Lm/b;->a:Lm/i;

    iput v6, v2, Lm/i;->d:I

    .line 21
    invoke-virtual {v2, v3}, Lm/i;->g(Lm/b;)V

    goto :goto_1

    :cond_a
    const/4 v0, 0x1

    goto/16 :goto_1

    :cond_b
    return v1
.end method

.method private C()V
    .locals 4

    .line 1
    sget-boolean v0, Lm/d;->r:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 2
    :goto_0
    iget-object v0, p0, Lm/d;->f:[Lm/b;

    array-length v3, v0

    if-ge v2, v3, :cond_3

    .line 3
    aget-object v0, v0, v2

    if-eqz v0, :cond_0

    .line 4
    iget-object v3, p0, Lm/d;->m:Lm/c;

    iget-object v3, v3, Lm/c;->a:Lm/f;

    invoke-interface {v3, v0}, Lm/f;->release(Ljava/lang/Object;)Z

    .line 5
    :cond_0
    iget-object v0, p0, Lm/d;->f:[Lm/b;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6
    :cond_1
    :goto_1
    iget-object v0, p0, Lm/d;->f:[Lm/b;

    array-length v3, v0

    if-ge v2, v3, :cond_3

    .line 7
    aget-object v0, v0, v2

    if-eqz v0, :cond_2

    .line 8
    iget-object v3, p0, Lm/d;->m:Lm/c;

    iget-object v3, v3, Lm/c;->b:Lm/f;

    invoke-interface {v3, v0}, Lm/f;->release(Ljava/lang/Object;)Z

    .line 9
    :cond_2
    iget-object v0, p0, Lm/d;->f:[Lm/b;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method private a(Lm/i$a;Ljava/lang/String;)Lm/i;
    .locals 2

    .line 1
    iget-object v0, p0, Lm/d;->m:Lm/c;

    iget-object v0, v0, Lm/c;->c:Lm/f;

    invoke-interface {v0}, Lm/f;->acquire()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/i;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lm/i;

    invoke-direct {v0, p1, p2}, Lm/i;-><init>(Lm/i$a;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0, p1, p2}, Lm/i;->f(Lm/i$a;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Lm/i;->d()V

    .line 5
    invoke-virtual {v0, p1, p2}, Lm/i;->f(Lm/i$a;Ljava/lang/String;)V

    .line 6
    :goto_0
    iget p1, p0, Lm/d;->o:I

    sget p2, Lm/d;->q:I

    if-lt p1, p2, :cond_1

    mul-int/lit8 p2, p2, 0x2

    .line 7
    sput p2, Lm/d;->q:I

    .line 8
    iget-object p1, p0, Lm/d;->n:[Lm/i;

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lm/i;

    iput-object p1, p0, Lm/d;->n:[Lm/i;

    .line 9
    :cond_1
    iget-object p1, p0, Lm/d;->n:[Lm/i;

    iget p2, p0, Lm/d;->o:I

    add-int/lit8 v1, p2, 0x1

    iput v1, p0, Lm/d;->o:I

    aput-object v0, p1, p2

    return-object v0
.end method

.method private final l(Lm/b;)V
    .locals 3

    .line 1
    sget-boolean v0, Lm/d;->r:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lm/d;->f:[Lm/b;

    iget v1, p0, Lm/d;->k:I

    aget-object v2, v0, v1

    if-eqz v2, :cond_1

    .line 3
    iget-object v2, p0, Lm/d;->m:Lm/c;

    iget-object v2, v2, Lm/c;->a:Lm/f;

    aget-object v0, v0, v1

    invoke-interface {v2, v0}, Lm/f;->release(Ljava/lang/Object;)Z

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lm/d;->f:[Lm/b;

    iget v1, p0, Lm/d;->k:I

    aget-object v2, v0, v1

    if-eqz v2, :cond_1

    .line 5
    iget-object v2, p0, Lm/d;->m:Lm/c;

    iget-object v2, v2, Lm/c;->b:Lm/f;

    aget-object v0, v0, v1

    invoke-interface {v2, v0}, Lm/f;->release(Ljava/lang/Object;)Z

    .line 6
    :cond_1
    :goto_0
    iget-object v0, p0, Lm/d;->f:[Lm/b;

    iget v1, p0, Lm/d;->k:I

    aput-object p1, v0, v1

    .line 7
    iget-object v0, p1, Lm/b;->a:Lm/i;

    iput v1, v0, Lm/i;->d:I

    add-int/lit8 v1, v1, 0x1

    .line 8
    iput v1, p0, Lm/d;->k:I

    .line 9
    invoke-virtual {v0, p1}, Lm/i;->g(Lm/b;)V

    return-void
.end method

.method private n()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget v1, p0, Lm/d;->k:I

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lm/d;->f:[Lm/b;

    aget-object v1, v1, v0

    .line 3
    iget-object v2, v1, Lm/b;->a:Lm/i;

    iget v1, v1, Lm/b;->b:F

    iput v1, v2, Lm/i;->f:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static s(Lm/d;Lm/i;Lm/i;F)Lm/b;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lm/d;->r()Lm/b;

    move-result-object p0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lm/b;->j(Lm/i;Lm/i;F)Lm/b;

    move-result-object p0

    return-object p0
.end method

.method private u(Lm/d$a;)I
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v0, p0

    const/4 v2, 0x0

    .line 1
    :goto_0
    iget v3, v0, Lm/d;->k:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ge v2, v3, :cond_2

    .line 2
    iget-object v3, v0, Lm/d;->f:[Lm/b;

    aget-object v6, v3, v2

    iget-object v6, v6, Lm/b;->a:Lm/i;

    .line 3
    iget-object v6, v6, Lm/i;->j:Lm/i$a;

    sget-object v7, Lm/i$a;->a:Lm/i$a;

    if-ne v6, v7, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    aget-object v3, v3, v2

    iget v3, v3, Lm/b;->b:F

    cmpg-float v3, v3, v4

    if-gez v3, :cond_1

    const/4 v2, 0x1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_f

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_3
    if-nez v2, :cond_e

    add-int/lit8 v3, v3, 0x1

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v9, -0x1

    const/4 v10, -0x1

    const/4 v11, 0x0

    .line 5
    :goto_4
    iget v12, v0, Lm/d;->k:I

    if-ge v8, v12, :cond_b

    .line 6
    iget-object v12, v0, Lm/d;->f:[Lm/b;

    aget-object v12, v12, v8

    .line 7
    iget-object v13, v12, Lm/b;->a:Lm/i;

    .line 8
    iget-object v13, v13, Lm/i;->j:Lm/i$a;

    sget-object v14, Lm/i$a;->a:Lm/i$a;

    if-ne v13, v14, :cond_3

    goto :goto_8

    .line 9
    :cond_3
    iget-boolean v13, v12, Lm/b;->f:Z

    if-eqz v13, :cond_4

    goto :goto_8

    .line 10
    :cond_4
    iget v13, v12, Lm/b;->b:F

    cmpg-float v13, v13, v4

    if-gez v13, :cond_a

    const/4 v13, 0x1

    .line 11
    :goto_5
    iget v14, v0, Lm/d;->j:I

    if-ge v13, v14, :cond_a

    .line 12
    iget-object v14, v0, Lm/d;->m:Lm/c;

    iget-object v14, v14, Lm/c;->d:[Lm/i;

    aget-object v14, v14, v13

    .line 13
    iget-object v15, v12, Lm/b;->e:Lm/b$a;

    invoke-interface {v15, v14}, Lm/b$a;->d(Lm/i;)F

    move-result v15

    cmpg-float v16, v15, v4

    if-gtz v16, :cond_5

    goto :goto_7

    :cond_5
    const/4 v1, 0x0

    :goto_6
    const/16 v4, 0x9

    if-ge v1, v4, :cond_9

    .line 14
    iget-object v4, v14, Lm/i;->h:[F

    aget v4, v4, v1

    div-float/2addr v4, v15

    cmpg-float v17, v4, v6

    if-gez v17, :cond_6

    if-eq v1, v11, :cond_7

    :cond_6
    if-le v1, v11, :cond_8

    :cond_7
    move v11, v1

    move v6, v4

    move v9, v8

    move v10, v13

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_9
    :goto_7
    add-int/lit8 v13, v13, 0x1

    const/4 v4, 0x0

    goto :goto_5

    :cond_a
    :goto_8
    add-int/lit8 v8, v8, 0x1

    const/4 v4, 0x0

    goto :goto_4

    :cond_b
    if-eq v9, v7, :cond_c

    .line 15
    iget-object v1, v0, Lm/d;->f:[Lm/b;

    aget-object v1, v1, v9

    .line 16
    iget-object v4, v1, Lm/b;->a:Lm/i;

    iput v7, v4, Lm/i;->d:I

    .line 17
    iget-object v4, v0, Lm/d;->m:Lm/c;

    iget-object v4, v4, Lm/c;->d:[Lm/i;

    aget-object v4, v4, v10

    invoke-virtual {v1, v4}, Lm/b;->y(Lm/i;)V

    .line 18
    iget-object v4, v1, Lm/b;->a:Lm/i;

    iput v9, v4, Lm/i;->d:I

    .line 19
    invoke-virtual {v4, v1}, Lm/i;->g(Lm/b;)V

    goto :goto_9

    :cond_c
    const/4 v2, 0x1

    .line 20
    :goto_9
    iget v1, v0, Lm/d;->j:I

    div-int/lit8 v1, v1, 0x2

    if-le v3, v1, :cond_d

    const/4 v2, 0x1

    :cond_d
    const/4 v4, 0x0

    goto/16 :goto_3

    :cond_e
    move v1, v3

    goto :goto_a

    :cond_f
    const/4 v1, 0x0

    :goto_a
    return v1
.end method

.method public static w()Lm/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method private y()V
    .locals 3

    .line 1
    iget v0, p0, Lm/d;->d:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lm/d;->d:I

    .line 2
    iget-object v1, p0, Lm/d;->f:[Lm/b;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm/b;

    iput-object v0, p0, Lm/d;->f:[Lm/b;

    .line 3
    iget-object v0, p0, Lm/d;->m:Lm/c;

    iget-object v1, v0, Lm/c;->d:[Lm/i;

    iget v2, p0, Lm/d;->d:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lm/i;

    iput-object v1, v0, Lm/c;->d:[Lm/i;

    .line 4
    iget v0, p0, Lm/d;->d:I

    new-array v1, v0, [Z

    iput-object v1, p0, Lm/d;->i:[Z

    .line 5
    iput v0, p0, Lm/d;->e:I

    .line 6
    iput v0, p0, Lm/d;->l:I

    return-void
.end method


# virtual methods
.method A(Lm/d$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lm/d;->u(Lm/d$a;)I

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lm/d;->B(Lm/d$a;Z)I

    .line 3
    invoke-direct {p0}, Lm/d;->n()V

    return-void
.end method

.method public D()V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lm/d;->m:Lm/c;

    iget-object v3, v2, Lm/c;->d:[Lm/i;

    array-length v4, v3

    if-ge v1, v4, :cond_1

    .line 2
    aget-object v2, v3, v1

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v2}, Lm/i;->d()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v1, v2, Lm/c;->c:Lm/f;

    iget-object v2, p0, Lm/d;->n:[Lm/i;

    iget v3, p0, Lm/d;->o:I

    invoke-interface {v1, v2, v3}, Lm/f;->a([Ljava/lang/Object;I)V

    .line 5
    iput v0, p0, Lm/d;->o:I

    .line 6
    iget-object v1, p0, Lm/d;->m:Lm/c;

    iget-object v1, v1, Lm/c;->d:[Lm/i;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    iget-object v1, p0, Lm/d;->b:Ljava/util/HashMap;

    if-eqz v1, :cond_2

    .line 8
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 9
    :cond_2
    iput v0, p0, Lm/d;->a:I

    .line 10
    iget-object v1, p0, Lm/d;->c:Lm/d$a;

    invoke-interface {v1}, Lm/d$a;->clear()V

    const/4 v1, 0x1

    .line 11
    iput v1, p0, Lm/d;->j:I

    const/4 v1, 0x0

    .line 12
    :goto_1
    iget v2, p0, Lm/d;->k:I

    if-ge v1, v2, :cond_3

    .line 13
    iget-object v2, p0, Lm/d;->f:[Lm/b;

    aget-object v2, v2, v1

    iput-boolean v0, v2, Lm/b;->c:Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 14
    :cond_3
    invoke-direct {p0}, Lm/d;->C()V

    .line 15
    iput v0, p0, Lm/d;->k:I

    .line 16
    sget-boolean v0, Lm/d;->r:Z

    if-eqz v0, :cond_4

    .line 17
    new-instance v0, Lm/d$b;

    iget-object v1, p0, Lm/d;->m:Lm/c;

    invoke-direct {v0, p0, v1}, Lm/d$b;-><init>(Lm/d;Lm/c;)V

    iput-object v0, p0, Lm/d;->p:Lm/d$a;

    goto :goto_2

    .line 18
    :cond_4
    new-instance v0, Lm/b;

    iget-object v1, p0, Lm/d;->m:Lm/c;

    invoke-direct {v0, v1}, Lm/b;-><init>(Lm/c;)V

    iput-object v0, p0, Lm/d;->p:Lm/d$a;

    :goto_2
    return-void
.end method

.method public b(Ln/e;Ln/e;FI)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 1
    sget-object v3, Ln/d$b;->b:Ln/d$b;

    invoke-virtual {v1, v3}, Ln/e;->n(Ln/d$b;)Ln/d;

    move-result-object v4

    invoke-virtual {v0, v4}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v6

    .line 2
    sget-object v4, Ln/d$b;->c:Ln/d$b;

    invoke-virtual {v1, v4}, Ln/e;->n(Ln/d$b;)Ln/d;

    move-result-object v5

    invoke-virtual {v0, v5}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v8

    .line 3
    sget-object v5, Ln/d$b;->d:Ln/d$b;

    invoke-virtual {v1, v5}, Ln/e;->n(Ln/d$b;)Ln/d;

    move-result-object v7

    invoke-virtual {v0, v7}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v13

    .line 4
    sget-object v7, Ln/d$b;->e:Ln/d$b;

    invoke-virtual {v1, v7}, Ln/e;->n(Ln/d$b;)Ln/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v9

    .line 5
    invoke-virtual {v2, v3}, Ln/e;->n(Ln/d$b;)Ln/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v1

    .line 6
    invoke-virtual {v2, v4}, Ln/e;->n(Ln/d$b;)Ln/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v10

    .line 7
    invoke-virtual {v2, v5}, Ln/e;->n(Ln/d$b;)Ln/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v3

    .line 8
    invoke-virtual {v2, v7}, Ln/e;->n(Ln/d$b;)Ln/d;

    move-result-object v2

    invoke-virtual {v0, v2}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v11

    .line 9
    invoke-virtual/range {p0 .. p0}, Lm/d;->r()Lm/b;

    move-result-object v2

    move/from16 v4, p3

    float-to-double v4, v4

    .line 10
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    move/from16 v7, p4

    move-object/from16 p1, v3

    move-wide/from16 p2, v4

    int-to-double v3, v7

    mul-double v14, v14, v3

    double-to-float v12, v14

    move-object v7, v2

    .line 11
    invoke-virtual/range {v7 .. v12}, Lm/b;->q(Lm/i;Lm/i;Lm/i;Lm/i;F)Lm/b;

    .line 12
    invoke-virtual {v0, v2}, Lm/d;->d(Lm/b;)V

    .line 13
    invoke-virtual/range {p0 .. p0}, Lm/d;->r()Lm/b;

    move-result-object v2

    .line 14
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    mul-double v7, v7, v3

    double-to-float v10, v7

    move-object v5, v2

    move-object v7, v13

    move-object v8, v1

    move-object/from16 v9, p1

    .line 15
    invoke-virtual/range {v5 .. v10}, Lm/b;->q(Lm/i;Lm/i;Lm/i;Lm/i;F)Lm/b;

    .line 16
    invoke-virtual {v0, v2}, Lm/d;->d(Lm/b;)V

    return-void
.end method

.method public c(Lm/i;Lm/i;IFLm/i;Lm/i;II)V
    .locals 11

    move-object v0, p0

    move/from16 v1, p8

    .line 1
    invoke-virtual {p0}, Lm/d;->r()Lm/b;

    move-result-object v10

    move-object v2, v10

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    .line 2
    invoke-virtual/range {v2 .. v9}, Lm/b;->h(Lm/i;Lm/i;IFLm/i;Lm/i;I)Lm/b;

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    .line 3
    invoke-virtual {v10, p0, v1}, Lm/b;->d(Lm/d;I)Lm/b;

    .line 4
    :cond_0
    invoke-virtual {p0, v10}, Lm/d;->d(Lm/b;)V

    return-void
.end method

.method public d(Lm/b;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget v0, p0, Lm/d;->k:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget v2, p0, Lm/d;->l:I

    if-ge v0, v2, :cond_1

    iget v0, p0, Lm/d;->j:I

    add-int/2addr v0, v1

    iget v2, p0, Lm/d;->e:I

    if-lt v0, v2, :cond_2

    .line 2
    :cond_1
    invoke-direct {p0}, Lm/d;->y()V

    :cond_2
    const/4 v0, 0x0

    .line 3
    iget-boolean v2, p1, Lm/b;->f:Z

    if-nez v2, :cond_9

    .line 4
    invoke-virtual {p1, p0}, Lm/b;->D(Lm/d;)V

    .line 5
    invoke-virtual {p1}, Lm/b;->u()Z

    move-result v2

    if-eqz v2, :cond_3

    return-void

    .line 6
    :cond_3
    invoke-virtual {p1}, Lm/b;->r()V

    .line 7
    invoke-virtual {p1, p0}, Lm/b;->f(Lm/d;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 8
    invoke-virtual {p0}, Lm/d;->p()Lm/i;

    move-result-object v0

    .line 9
    iput-object v0, p1, Lm/b;->a:Lm/i;

    .line 10
    invoke-direct {p0, p1}, Lm/d;->l(Lm/b;)V

    .line 11
    iget-object v2, p0, Lm/d;->p:Lm/d$a;

    invoke-interface {v2, p1}, Lm/d$a;->c(Lm/d$a;)V

    .line 12
    iget-object v2, p0, Lm/d;->p:Lm/d$a;

    invoke-direct {p0, v2, v1}, Lm/d;->B(Lm/d$a;Z)I

    .line 13
    iget v2, v0, Lm/i;->d:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_7

    .line 14
    iget-object v2, p1, Lm/b;->a:Lm/i;

    if-ne v2, v0, :cond_4

    .line 15
    invoke-virtual {p1, v0}, Lm/b;->w(Lm/i;)Lm/i;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 16
    invoke-virtual {p1, v0}, Lm/b;->y(Lm/i;)V

    .line 17
    :cond_4
    iget-boolean v0, p1, Lm/b;->f:Z

    if-nez v0, :cond_5

    .line 18
    iget-object v0, p1, Lm/b;->a:Lm/i;

    invoke-virtual {v0, p1}, Lm/i;->g(Lm/b;)V

    .line 19
    :cond_5
    iget v0, p0, Lm/d;->k:I

    sub-int/2addr v0, v1

    iput v0, p0, Lm/d;->k:I

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    .line 20
    :cond_7
    :goto_0
    invoke-virtual {p1}, Lm/b;->s()Z

    move-result v0

    if-nez v0, :cond_8

    return-void

    :cond_8
    move v0, v1

    :cond_9
    if-nez v0, :cond_a

    .line 21
    invoke-direct {p0, p1}, Lm/d;->l(Lm/b;)V

    :cond_a
    return-void
.end method

.method public e(Lm/i;Lm/i;II)Lm/b;
    .locals 3

    const/16 v0, 0x8

    if-ne p4, v0, :cond_0

    .line 1
    iget-boolean v1, p2, Lm/i;->g:Z

    if-eqz v1, :cond_0

    iget v1, p1, Lm/i;->d:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 2
    iget p2, p2, Lm/i;->f:F

    int-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p0, p2}, Lm/i;->e(Lm/d;F)V

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {p0}, Lm/d;->r()Lm/b;

    move-result-object v1

    .line 4
    invoke-virtual {v1, p1, p2, p3}, Lm/b;->n(Lm/i;Lm/i;I)Lm/b;

    if-eq p4, v0, :cond_1

    .line 5
    invoke-virtual {v1, p0, p4}, Lm/b;->d(Lm/d;I)Lm/b;

    .line 6
    :cond_1
    invoke-virtual {p0, v1}, Lm/d;->d(Lm/b;)V

    return-object v1
.end method

.method public f(Lm/i;I)V
    .locals 2

    .line 1
    iget v0, p1, Lm/i;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    int-to-float p2, p2

    .line 2
    invoke-virtual {p1, p0, p2}, Lm/i;->e(Lm/d;F)V

    return-void

    :cond_0
    if-eq v0, v1, :cond_3

    .line 3
    iget-object v1, p0, Lm/d;->f:[Lm/b;

    aget-object v0, v1, v0

    .line 4
    iget-boolean v1, v0, Lm/b;->f:Z

    if-eqz v1, :cond_1

    int-to-float p1, p2

    .line 5
    iput p1, v0, Lm/b;->b:F

    goto :goto_0

    .line 6
    :cond_1
    iget-object v1, v0, Lm/b;->e:Lm/b$a;

    invoke-interface {v1}, Lm/b$a;->getCurrentSize()I

    move-result v1

    if-nez v1, :cond_2

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, v0, Lm/b;->f:Z

    int-to-float p1, p2

    .line 8
    iput p1, v0, Lm/b;->b:F

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {p0}, Lm/d;->r()Lm/b;

    move-result-object v0

    .line 10
    invoke-virtual {v0, p1, p2}, Lm/b;->m(Lm/i;I)Lm/b;

    .line 11
    invoke-virtual {p0, v0}, Lm/d;->d(Lm/b;)V

    goto :goto_0

    .line 12
    :cond_3
    invoke-virtual {p0}, Lm/d;->r()Lm/b;

    move-result-object v0

    .line 13
    invoke-virtual {v0, p1, p2}, Lm/b;->i(Lm/i;I)Lm/b;

    .line 14
    invoke-virtual {p0, v0}, Lm/d;->d(Lm/b;)V

    :goto_0
    return-void
.end method

.method public g(Lm/i;Lm/i;IZ)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm/d;->r()Lm/b;

    move-result-object p4

    .line 2
    invoke-virtual {p0}, Lm/d;->t()Lm/i;

    move-result-object v0

    const/4 v1, 0x0

    .line 3
    iput v1, v0, Lm/i;->e:I

    .line 4
    invoke-virtual {p4, p1, p2, v0, p3}, Lm/b;->o(Lm/i;Lm/i;Lm/i;I)Lm/b;

    .line 5
    invoke-virtual {p0, p4}, Lm/d;->d(Lm/b;)V

    return-void
.end method

.method public h(Lm/i;Lm/i;II)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lm/d;->r()Lm/b;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lm/d;->t()Lm/i;

    move-result-object v1

    const/4 v2, 0x0

    .line 3
    iput v2, v1, Lm/i;->e:I

    .line 4
    invoke-virtual {v0, p1, p2, v1, p3}, Lm/b;->o(Lm/i;Lm/i;Lm/i;I)Lm/b;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    .line 5
    iget-object p1, v0, Lm/b;->e:Lm/b$a;

    invoke-interface {p1, v1}, Lm/b$a;->d(Lm/i;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    .line 6
    invoke-virtual {p0, v0, p1, p4}, Lm/d;->m(Lm/b;II)V

    .line 7
    :cond_0
    invoke-virtual {p0, v0}, Lm/d;->d(Lm/b;)V

    return-void
.end method

.method public i(Lm/i;Lm/i;IZ)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm/d;->r()Lm/b;

    move-result-object p4

    .line 2
    invoke-virtual {p0}, Lm/d;->t()Lm/i;

    move-result-object v0

    const/4 v1, 0x0

    .line 3
    iput v1, v0, Lm/i;->e:I

    .line 4
    invoke-virtual {p4, p1, p2, v0, p3}, Lm/b;->p(Lm/i;Lm/i;Lm/i;I)Lm/b;

    .line 5
    invoke-virtual {p0, p4}, Lm/d;->d(Lm/b;)V

    return-void
.end method

.method public j(Lm/i;Lm/i;II)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lm/d;->r()Lm/b;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lm/d;->t()Lm/i;

    move-result-object v1

    const/4 v2, 0x0

    .line 3
    iput v2, v1, Lm/i;->e:I

    .line 4
    invoke-virtual {v0, p1, p2, v1, p3}, Lm/b;->p(Lm/i;Lm/i;Lm/i;I)Lm/b;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    .line 5
    iget-object p1, v0, Lm/b;->e:Lm/b$a;

    invoke-interface {p1, v1}, Lm/b$a;->d(Lm/i;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    .line 6
    invoke-virtual {p0, v0, p1, p4}, Lm/d;->m(Lm/b;II)V

    .line 7
    :cond_0
    invoke-virtual {p0, v0}, Lm/d;->d(Lm/b;)V

    return-void
.end method

.method public k(Lm/i;Lm/i;Lm/i;Lm/i;FI)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lm/d;->r()Lm/b;

    move-result-object v6

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 2
    invoke-virtual/range {v0 .. v5}, Lm/b;->k(Lm/i;Lm/i;Lm/i;Lm/i;F)Lm/b;

    const/16 p1, 0x8

    if-eq p6, p1, :cond_0

    .line 3
    invoke-virtual {v6, p0, p6}, Lm/b;->d(Lm/d;I)Lm/b;

    .line 4
    :cond_0
    invoke-virtual {p0, v6}, Lm/d;->d(Lm/b;)V

    return-void
.end method

.method m(Lm/b;II)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p3, v0}, Lm/d;->o(ILjava/lang/String;)Lm/i;

    move-result-object p3

    .line 2
    invoke-virtual {p1, p3, p2}, Lm/b;->e(Lm/i;I)Lm/b;

    return-void
.end method

.method public o(ILjava/lang/String;)Lm/i;
    .locals 2

    .line 1
    iget v0, p0, Lm/d;->j:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lm/d;->e:I

    if-lt v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lm/d;->y()V

    .line 3
    :cond_0
    sget-object v0, Lm/i$a;->d:Lm/i$a;

    invoke-direct {p0, v0, p2}, Lm/d;->a(Lm/i$a;Ljava/lang/String;)Lm/i;

    move-result-object p2

    .line 4
    iget v0, p0, Lm/d;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lm/d;->a:I

    .line 5
    iget v1, p0, Lm/d;->j:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lm/d;->j:I

    .line 6
    iput v0, p2, Lm/i;->c:I

    .line 7
    iput p1, p2, Lm/i;->e:I

    .line 8
    iget-object p1, p0, Lm/d;->m:Lm/c;

    iget-object p1, p1, Lm/c;->d:[Lm/i;

    aput-object p2, p1, v0

    .line 9
    iget-object p1, p0, Lm/d;->c:Lm/d$a;

    invoke-interface {p1, p2}, Lm/d$a;->b(Lm/i;)V

    return-object p2
.end method

.method public p()Lm/i;
    .locals 3

    .line 1
    iget v0, p0, Lm/d;->j:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lm/d;->e:I

    if-lt v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lm/d;->y()V

    .line 3
    :cond_0
    sget-object v0, Lm/i$a;->c:Lm/i$a;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lm/d;->a(Lm/i$a;Ljava/lang/String;)Lm/i;

    move-result-object v0

    .line 4
    iget v1, p0, Lm/d;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lm/d;->a:I

    .line 5
    iget v2, p0, Lm/d;->j:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lm/d;->j:I

    .line 6
    iput v1, v0, Lm/i;->c:I

    .line 7
    iget-object v2, p0, Lm/d;->m:Lm/c;

    iget-object v2, v2, Lm/c;->d:[Lm/i;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public q(Ljava/lang/Object;)Lm/i;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    iget v1, p0, Lm/d;->j:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Lm/d;->e:I

    if-lt v1, v2, :cond_1

    .line 2
    invoke-direct {p0}, Lm/d;->y()V

    .line 3
    :cond_1
    instance-of v1, p1, Ln/d;

    if-eqz v1, :cond_5

    .line 4
    check-cast p1, Ln/d;

    invoke-virtual {p1}, Ln/d;->f()Lm/i;

    move-result-object v0

    if-nez v0, :cond_2

    .line 5
    iget-object v0, p0, Lm/d;->m:Lm/c;

    invoke-virtual {p1, v0}, Ln/d;->m(Lm/c;)V

    .line 6
    invoke-virtual {p1}, Ln/d;->f()Lm/i;

    move-result-object p1

    move-object v0, p1

    .line 7
    :cond_2
    iget p1, v0, Lm/i;->c:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    iget v2, p0, Lm/d;->a:I

    if-gt p1, v2, :cond_3

    iget-object v2, p0, Lm/d;->m:Lm/c;

    iget-object v2, v2, Lm/c;->d:[Lm/i;

    aget-object v2, v2, p1

    if-nez v2, :cond_5

    :cond_3
    if-eq p1, v1, :cond_4

    .line 8
    invoke-virtual {v0}, Lm/i;->d()V

    .line 9
    :cond_4
    iget p1, p0, Lm/d;->a:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lm/d;->a:I

    .line 10
    iget v1, p0, Lm/d;->j:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lm/d;->j:I

    .line 11
    iput p1, v0, Lm/i;->c:I

    .line 12
    sget-object v1, Lm/i$a;->a:Lm/i$a;

    iput-object v1, v0, Lm/i;->j:Lm/i$a;

    .line 13
    iget-object v1, p0, Lm/d;->m:Lm/c;

    iget-object v1, v1, Lm/c;->d:[Lm/i;

    aput-object v0, v1, p1

    :cond_5
    return-object v0
.end method

.method public r()Lm/b;
    .locals 5

    .line 1
    sget-boolean v0, Lm/d;->r:Z

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lm/d;->m:Lm/c;

    iget-object v0, v0, Lm/c;->a:Lm/f;

    invoke-interface {v0}, Lm/f;->acquire()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lm/d$b;

    iget-object v3, p0, Lm/d;->m:Lm/c;

    invoke-direct {v0, p0, v3}, Lm/d$b;-><init>(Lm/d;Lm/c;)V

    .line 4
    sget-wide v3, Lm/d;->t:J

    add-long/2addr v3, v1

    sput-wide v3, Lm/d;->t:J

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0}, Lm/b;->z()V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lm/d;->m:Lm/c;

    iget-object v0, v0, Lm/c;->b:Lm/f;

    invoke-interface {v0}, Lm/f;->acquire()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b;

    if-nez v0, :cond_2

    .line 7
    new-instance v0, Lm/b;

    iget-object v3, p0, Lm/d;->m:Lm/c;

    invoke-direct {v0, v3}, Lm/b;-><init>(Lm/c;)V

    .line 8
    sget-wide v3, Lm/d;->s:J

    add-long/2addr v3, v1

    sput-wide v3, Lm/d;->s:J

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {v0}, Lm/b;->z()V

    .line 10
    :goto_0
    invoke-static {}, Lm/i;->b()V

    return-object v0
.end method

.method public t()Lm/i;
    .locals 3

    .line 1
    iget v0, p0, Lm/d;->j:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lm/d;->e:I

    if-lt v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lm/d;->y()V

    .line 3
    :cond_0
    sget-object v0, Lm/i$a;->c:Lm/i$a;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lm/d;->a(Lm/i$a;Ljava/lang/String;)Lm/i;

    move-result-object v0

    .line 4
    iget v1, p0, Lm/d;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lm/d;->a:I

    .line 5
    iget v2, p0, Lm/d;->j:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lm/d;->j:I

    .line 6
    iput v1, v0, Lm/i;->c:I

    .line 7
    iget-object v2, p0, Lm/d;->m:Lm/c;

    iget-object v2, v2, Lm/c;->d:[Lm/i;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public v()Lm/c;
    .locals 1

    iget-object v0, p0, Lm/d;->m:Lm/c;

    return-object v0
.end method

.method public x(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Ln/d;

    invoke-virtual {p1}, Ln/d;->f()Lm/i;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget p1, p1, Lm/i;->f:F

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public z()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lm/d;->g:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lm/d;->h:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lm/d;->c:Lm/d$a;

    invoke-virtual {p0, v0}, Lm/d;->A(Lm/d$a;)V

    goto :goto_3

    :cond_1
    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    :goto_1
    iget v2, p0, Lm/d;->k:I

    if-ge v1, v2, :cond_3

    .line 4
    iget-object v2, p0, Lm/d;->f:[Lm/b;

    aget-object v2, v2, v1

    .line 5
    iget-boolean v2, v2, Lm/b;->f:Z

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x1

    :goto_2
    if-nez v0, :cond_4

    .line 6
    iget-object v0, p0, Lm/d;->c:Lm/d$a;

    invoke-virtual {p0, v0}, Lm/d;->A(Lm/d$a;)V

    goto :goto_3

    .line 7
    :cond_4
    invoke-direct {p0}, Lm/d;->n()V

    :goto_3
    return-void
.end method
