.class public final Li9/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln9/p;


# direct methods
.method public constructor <init>(IJLjava/util/concurrent/TimeUnit;Lm9/d;Ln9/f;IIIIIZZLn9/t;)V
    .locals 13

    const-string v0, "timeUnit"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskRunner"

    move-object/from16 v3, p5

    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionListener"

    move-object/from16 v12, p6

    invoke-static {v12, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "routeDatabase"

    move-object/from16 v11, p14

    invoke-static {v11, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    new-instance v0, Ln9/p;

    .line 9
    new-instance v2, Li9/k;

    move/from16 v4, p7

    move/from16 v5, p8

    move/from16 v6, p9

    move/from16 v7, p10

    move/from16 v8, p11

    move/from16 v9, p12

    move/from16 v10, p13

    invoke-direct/range {v2 .. v11}, Li9/k;-><init>(Lm9/d;IIIIIZZLn9/t;)V

    move/from16 p9, p1

    move-wide/from16 p10, p2

    move-object/from16 p7, v0

    move-object/from16 p12, v1

    move-object/from16 p14, v2

    move-object/from16 p8, v3

    move-object/from16 p13, v12

    .line 10
    invoke-direct/range {p7 .. p14}, Ln9/p;-><init>(Lm9/d;IJLjava/util/concurrent/TimeUnit;Ln9/f;Lx7/q;)V

    move-object/from16 p1, p7

    .line 11
    invoke-direct {p0, p1}, Li9/l;-><init>(Ln9/p;)V

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/util/concurrent/TimeUnit;Lm9/d;Ln9/f;IIIIIZZLn9/t;ILkotlin/jvm/internal/n;)V
    .locals 15

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x5

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    const-wide/16 v2, 0x5

    goto :goto_1

    :cond_1
    move-wide/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    .line 3
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    .line 4
    sget-object v5, Lm9/d;->m:Lm9/d;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    .line 5
    sget-object v6, Ln9/f;->a:Ln9/f$b;

    invoke-virtual {v6}, Ln9/f$b;->a()Ln9/f;

    move-result-object v6

    goto :goto_4

    :cond_4
    move-object/from16 v6, p6

    :goto_4
    and-int/lit8 v7, v0, 0x20

    const/16 v8, 0x2710

    if-eqz v7, :cond_5

    move v7, v8

    goto :goto_5

    :cond_5
    move/from16 v7, p7

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    move v9, v8

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    move v10, v8

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    move v11, v8

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    goto :goto_9

    :cond_9
    move/from16 v8, p11

    :goto_9
    and-int/lit16 v12, v0, 0x400

    const/4 v13, 0x1

    if-eqz v12, :cond_a

    move v12, v13

    goto :goto_a

    :cond_a
    move/from16 v12, p12

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    goto :goto_b

    :cond_b
    move/from16 v13, p13

    :goto_b
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    .line 6
    new-instance v0, Ln9/t;

    invoke-direct {v0}, Ln9/t;-><init>()V

    move-object/from16 p15, v0

    :goto_c
    move-object/from16 p1, p0

    move/from16 p2, v1

    move-wide/from16 p3, v2

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move/from16 p8, v7

    move/from16 p12, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p13, v12

    move/from16 p14, v13

    goto :goto_d

    :cond_c
    move-object/from16 p15, p14

    goto :goto_c

    .line 7
    :goto_d
    invoke-direct/range {p1 .. p15}, Li9/l;-><init>(IJLjava/util/concurrent/TimeUnit;Lm9/d;Ln9/f;IIIIIZZLn9/t;)V

    return-void
.end method

.method public constructor <init>(Ln9/p;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li9/l;->a:Ln9/p;

    return-void
.end method

.method public static synthetic a(Lm9/d;IIIIIZZLn9/t;Ln9/p;Li9/a;Ln9/g;)Ln9/i;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p11}, Li9/l;->b(Lm9/d;IIIIIZZLn9/t;Ln9/p;Li9/a;Ln9/g;)Ln9/i;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lm9/d;IIIIIZZLn9/t;Ln9/p;Li9/a;Ln9/g;)Ln9/i;
    .locals 15

    .line 1
    const-string v0, "pool"

    .line 2
    .line 3
    move-object/from16 v3, p9

    .line 4
    .line 5
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "address"

    .line 9
    .line 10
    move-object/from16 v11, p10

    .line 11
    .line 12
    invoke-static {v11, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "user"

    .line 16
    .line 17
    move-object/from16 v13, p11

    .line 18
    .line 19
    invoke-static {v13, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Ln9/k;

    .line 23
    .line 24
    new-instance v14, Ln9/l;

    .line 25
    .line 26
    new-instance v1, Ln9/q;

    .line 27
    .line 28
    move-object v2, p0

    .line 29
    move/from16 v4, p1

    .line 30
    .line 31
    move/from16 v5, p2

    .line 32
    .line 33
    move/from16 v6, p3

    .line 34
    .line 35
    move/from16 v7, p4

    .line 36
    .line 37
    move/from16 v8, p5

    .line 38
    .line 39
    move/from16 v9, p6

    .line 40
    .line 41
    move/from16 v10, p7

    .line 42
    .line 43
    move-object/from16 v12, p8

    .line 44
    .line 45
    invoke-direct/range {v1 .. v13}, Ln9/q;-><init>(Lm9/d;Ln9/p;IIIIIZZLi9/a;Ln9/t;Ln9/g;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v14, v1}, Ln9/l;-><init>(Ln9/q;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v14, p0}, Ln9/k;-><init>(Ln9/u;Lm9/d;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method


# virtual methods
.method public final c()Ln9/p;
    .locals 1

    .line 1
    iget-object v0, p0, Li9/l;->a:Ln9/p;

    .line 2
    .line 3
    return-object v0
.end method
