.class public final Lcom/google/gson/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final m:Lcom/google/gson/b;

.field public static final n:Lcom/google/gson/FieldNamingPolicy;

.field public static final o:Lcom/google/gson/ToNumberPolicy;

.field public static final p:Lcom/google/gson/ToNumberPolicy;


# instance fields
.field public final a:Ljava/lang/ThreadLocal;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public final c:Lcom/google/gson/internal/b;

.field public final d:Lg1/l;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/Map;

.field public final g:Z

.field public final h:Z

.field public final i:Lcom/google/gson/b;

.field public final j:Ljava/util/List;

.field public final k:Ljava/util/List;

.field public final l:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/gson/b;->d:Lcom/google/gson/b;

    .line 2
    .line 3
    sput-object v0, Lcom/google/gson/g;->m:Lcom/google/gson/b;

    .line 4
    .line 5
    sget-object v0, Lcom/google/gson/FieldNamingPolicy;->IDENTITY:Lcom/google/gson/FieldNamingPolicy;

    .line 6
    .line 7
    sput-object v0, Lcom/google/gson/g;->n:Lcom/google/gson/FieldNamingPolicy;

    .line 8
    .line 9
    sget-object v0, Lcom/google/gson/ToNumberPolicy;->DOUBLE:Lcom/google/gson/ToNumberPolicy;

    .line 10
    .line 11
    sput-object v0, Lcom/google/gson/g;->o:Lcom/google/gson/ToNumberPolicy;

    .line 12
    .line 13
    sget-object v0, Lcom/google/gson/ToNumberPolicy;->LAZILY_PARSED_NUMBER:Lcom/google/gson/ToNumberPolicy;

    .line 14
    .line 15
    sput-object v0, Lcom/google/gson/g;->p:Lcom/google/gson/ToNumberPolicy;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 16

    .line 1
    sget-object v1, Lcom/google/gson/internal/d;->c:Lcom/google/gson/internal/d;

    .line 2
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    sget-object v9, Lcom/google/gson/LongSerializationPolicy;->DEFAULT:Lcom/google/gson/LongSerializationPolicy;

    .line 3
    sget-object v10, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    sget-object v13, Lcom/google/gson/g;->o:Lcom/google/gson/ToNumberPolicy;

    sget-object v14, Lcom/google/gson/g;->p:Lcom/google/gson/ToNumberPolicy;

    .line 5
    sget-object v2, Lcom/google/gson/g;->n:Lcom/google/gson/FieldNamingPolicy;

    const/4 v4, 0x0

    const/4 v5, 0x1

    sget-object v6, Lcom/google/gson/g;->m:Lcom/google/gson/b;

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v11, v10

    move-object v12, v10

    move-object v15, v10

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v15}, Lcom/google/gson/g;-><init>(Lcom/google/gson/internal/d;Lcom/google/gson/a;Ljava/util/Map;ZZLcom/google/gson/b;ZZLcom/google/gson/LongSerializationPolicy;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/gson/n;Lcom/google/gson/n;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/gson/internal/d;Lcom/google/gson/a;Ljava/util/Map;ZZLcom/google/gson/b;ZZLcom/google/gson/LongSerializationPolicy;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/gson/n;Lcom/google/gson/n;Ljava/util/List;)V
    .locals 10

    move-object/from16 v0, p13

    move-object/from16 v1, p14

    move-object/from16 v2, p15

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v3, Ljava/lang/ThreadLocal;

    invoke-direct {v3}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v3, p0, Lcom/google/gson/g;->a:Ljava/lang/ThreadLocal;

    .line 8
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v3, p0, Lcom/google/gson/g;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    iput-object p3, p0, Lcom/google/gson/g;->f:Ljava/util/Map;

    .line 10
    new-instance v3, Lcom/google/gson/internal/b;

    move/from16 v4, p8

    invoke-direct {v3, p3, v4, v2}, Lcom/google/gson/internal/b;-><init>(Ljava/util/Map;ZLjava/util/List;)V

    iput-object v3, p0, Lcom/google/gson/g;->c:Lcom/google/gson/internal/b;

    .line 11
    iput-boolean p4, p0, Lcom/google/gson/g;->g:Z

    .line 12
    iput-boolean p5, p0, Lcom/google/gson/g;->h:Z

    move-object/from16 p3, p6

    .line 13
    iput-object p3, p0, Lcom/google/gson/g;->i:Lcom/google/gson/b;

    move-object/from16 p3, p10

    .line 14
    iput-object p3, p0, Lcom/google/gson/g;->j:Ljava/util/List;

    move-object/from16 p3, p11

    .line 15
    iput-object p3, p0, Lcom/google/gson/g;->k:Ljava/util/List;

    .line 16
    iput-object v2, p0, Lcom/google/gson/g;->l:Ljava/util/List;

    .line 17
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 18
    sget-object p3, Lg1/f1;->C:Lg1/u0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    sget-object p3, Lg1/t;->c:Lg1/p;

    .line 20
    sget-object p3, Lcom/google/gson/ToNumberPolicy;->DOUBLE:Lcom/google/gson/ToNumberPolicy;

    const/4 v5, 0x1

    if-ne v0, p3, :cond_0

    .line 21
    sget-object p3, Lg1/t;->c:Lg1/p;

    goto :goto_0

    .line 22
    :cond_0
    new-instance p3, Lg1/p;

    invoke-direct {p3, v0, v5}, Lg1/p;-><init>(Ljava/lang/Object;I)V

    .line 23
    :goto_0
    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 p3, p12

    .line 25
    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 26
    sget-object p3, Lg1/f1;->r:Lg1/u0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    sget-object p3, Lg1/f1;->g:Lg1/w0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    sget-object p3, Lg1/f1;->d:Lg1/w0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    sget-object p3, Lg1/f1;->e:Lg1/w0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    sget-object p3, Lg1/f1;->f:Lg1/w0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    sget-object p3, Lcom/google/gson/LongSerializationPolicy;->DEFAULT:Lcom/google/gson/LongSerializationPolicy;

    move-object/from16 v0, p9

    if-ne v0, p3, :cond_1

    .line 32
    sget-object p3, Lg1/f1;->k:Lg1/c0;

    goto :goto_1

    .line 33
    :cond_1
    new-instance p3, Lcom/google/gson/d;

    invoke-direct {p3}, Lcom/google/gson/d;-><init>()V

    .line 34
    :goto_1
    new-instance v0, Lg1/w0;

    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v7, Ljava/lang/Long;

    invoke-direct {v0, v6, v7, p3}, Lg1/w0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)V

    .line 35
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    if-eqz p7, :cond_2

    .line 36
    sget-object v6, Lg1/f1;->m:Lg1/e0;

    goto :goto_2

    .line 37
    :cond_2
    new-instance v6, Lcom/google/gson/c;

    .line 38
    invoke-direct {v6, v0}, Lcom/google/gson/c;-><init>(I)V

    .line 39
    :goto_2
    new-instance v7, Lg1/w0;

    sget-object v8, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v9, Ljava/lang/Double;

    invoke-direct {v7, v8, v9, v6}, Lg1/w0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)V

    .line 40
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz p7, :cond_3

    .line 41
    sget-object v6, Lg1/f1;->l:Lg1/d0;

    goto :goto_3

    .line 42
    :cond_3
    new-instance v6, Lcom/google/gson/c;

    .line 43
    invoke-direct {v6, v5}, Lcom/google/gson/c;-><init>(I)V

    .line 44
    :goto_3
    new-instance v7, Lg1/w0;

    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v9, Ljava/lang/Float;

    invoke-direct {v7, v8, v9, v6}, Lg1/w0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)V

    .line 45
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    sget-object v6, Lg1/r;->b:Lg1/p;

    .line 47
    sget-object v6, Lcom/google/gson/ToNumberPolicy;->LAZILY_PARSED_NUMBER:Lcom/google/gson/ToNumberPolicy;

    if-ne v1, v6, :cond_4

    .line 48
    sget-object v1, Lg1/r;->b:Lg1/p;

    goto :goto_4

    .line 49
    :cond_4
    new-instance v6, Lg1/r;

    invoke-direct {v6, v1}, Lg1/r;-><init>(Lcom/google/gson/n;)V

    .line 50
    new-instance v1, Lg1/p;

    invoke-direct {v1, v6, v0}, Lg1/p;-><init>(Ljava/lang/Object;I)V

    .line 51
    :goto_4
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    sget-object v1, Lg1/f1;->h:Lg1/u0;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    sget-object v1, Lg1/f1;->i:Lg1/u0;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    new-instance v1, Lcom/google/gson/e;

    invoke-direct {v1, p3, v0}, Lcom/google/gson/e;-><init>(Lcom/google/gson/p;I)V

    .line 55
    invoke-virtual {v1}, Lcom/google/gson/p;->a()Lcom/google/gson/o;

    move-result-object v1

    .line 56
    new-instance v6, Lg1/u0;

    const-class v7, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v6, v7, v1, v0}, Lg1/u0;-><init>(Ljava/lang/Class;Lcom/google/gson/p;I)V

    .line 57
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    new-instance v1, Lcom/google/gson/e;

    invoke-direct {v1, p3, v5}, Lcom/google/gson/e;-><init>(Lcom/google/gson/p;I)V

    .line 59
    invoke-virtual {v1}, Lcom/google/gson/p;->a()Lcom/google/gson/o;

    move-result-object p3

    .line 60
    new-instance v1, Lg1/u0;

    const-class v6, Ljava/util/concurrent/atomic/AtomicLongArray;

    invoke-direct {v1, v6, p3, v0}, Lg1/u0;-><init>(Ljava/lang/Class;Lcom/google/gson/p;I)V

    .line 61
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    sget-object p3, Lg1/f1;->j:Lg1/u0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    sget-object p3, Lg1/f1;->n:Lg1/w0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    sget-object p3, Lg1/f1;->s:Lg1/u0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    sget-object p3, Lg1/f1;->t:Lg1/u0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    sget-object p3, Lg1/f1;->o:Lg1/h0;

    .line 67
    new-instance v1, Lg1/u0;

    const-class v6, Ljava/math/BigDecimal;

    invoke-direct {v1, v6, p3, v0}, Lg1/u0;-><init>(Ljava/lang/Class;Lcom/google/gson/p;I)V

    .line 68
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    sget-object p3, Lg1/f1;->p:Lg1/i0;

    .line 70
    new-instance v1, Lg1/u0;

    const-class v6, Ljava/math/BigInteger;

    invoke-direct {v1, v6, p3, v0}, Lg1/u0;-><init>(Ljava/lang/Class;Lcom/google/gson/p;I)V

    .line 71
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    sget-object p3, Lg1/f1;->q:Lg1/j0;

    .line 73
    new-instance v1, Lg1/u0;

    const-class v6, Lcom/google/gson/internal/LazilyParsedNumber;

    invoke-direct {v1, v6, p3, v0}, Lg1/u0;-><init>(Ljava/lang/Class;Lcom/google/gson/p;I)V

    .line 74
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    sget-object p3, Lg1/f1;->u:Lg1/u0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    sget-object p3, Lg1/f1;->v:Lg1/u0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    sget-object p3, Lg1/f1;->x:Lg1/u0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    sget-object p3, Lg1/f1;->y:Lg1/u0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    sget-object p3, Lg1/f1;->A:Lg1/u0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    sget-object p3, Lg1/f1;->w:Lg1/u0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    sget-object p3, Lg1/f1;->b:Lg1/u0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    sget-object p3, Lg1/h;->c:Lg1/e;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    sget-object p3, Lg1/f1;->z:Lg1/p;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    sget-boolean p3, Lj1/f;->a:Z

    if-eqz p3, :cond_5

    .line 85
    sget-object p3, Lj1/f;->e:Lj1/b$a;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    sget-object p3, Lj1/f;->d:Lj1/a$a;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    sget-object p3, Lj1/f;->f:Lj1/c;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    :cond_5
    sget-object p3, Lg1/b;->c:Lg1/a;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    sget-object p3, Lg1/f1;->a:Lg1/u0;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    new-instance p3, Lg1/d;

    invoke-direct {p3, v3, v0}, Lg1/d;-><init>(Lcom/google/gson/internal/b;I)V

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    new-instance p3, Lg1/d;

    invoke-direct {p3, v3, v5}, Lg1/d;-><init>(Lcom/google/gson/internal/b;I)V

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    new-instance p3, Lg1/l;

    invoke-direct {p3, v3}, Lg1/l;-><init>(Lcom/google/gson/internal/b;)V

    iput-object p3, p0, Lcom/google/gson/g;->d:Lg1/l;

    .line 93
    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    sget-object v0, Lg1/f1;->D:Lg1/i;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    new-instance v0, Lg1/z;

    move-object/from16 p6, p1

    move-object p5, p2

    move-object/from16 p7, p3

    move-object p3, v0

    move-object/from16 p8, v2

    move-object p4, v3

    invoke-direct/range {p3 .. p8}, Lg1/z;-><init>(Lcom/google/gson/internal/b;Lcom/google/gson/a;Lcom/google/gson/internal/d;Lg1/l;Ljava/util/List;)V

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/gson/g;->e:Ljava/util/List;

    return-void
.end method

.method public static a(D)V
    .locals 2

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method


# virtual methods
.method public final b(Ljava/io/Reader;Lk1/a;)Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v0, Ll1/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ll1/a;-><init>(Ljava/io/Reader;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lcom/google/gson/Strictness;->LEGACY_STRICT:Lcom/google/gson/Strictness;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ll1/a;->A(Lcom/google/gson/Strictness;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "AssertionError (GSON 2.13.1): "

    .line 12
    .line 13
    const-string v2, "Type adapter \'"

    .line 14
    .line 15
    iget-object v3, v0, Ll1/a;->b:Lcom/google/gson/Strictness;

    .line 16
    .line 17
    if-ne v3, p1, :cond_0

    .line 18
    .line 19
    sget-object p1, Lcom/google/gson/Strictness;->LENIENT:Lcom/google/gson/Strictness;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ll1/a;->A(Lcom/google/gson/Strictness;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ll1/a;->x()Lcom/google/gson/stream/JsonToken;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    :try_start_1
    invoke-virtual {p0, p2}, Lcom/google/gson/g;->d(Lk1/a;)Lcom/google/gson/p;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget-object p2, p2, Lk1/a;->a:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-virtual {v4, v0}, Lcom/google/gson/p;->b(Ll1/a;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static {p2}, Lcom/google/gson/internal/e;->l(Ljava/lang/Class;)Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    new-instance v6, Ljava/lang/ClassCastException;

    .line 52
    .line 53
    new-instance v7, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v2, "\' returned wrong type; requested "

    .line 62
    .line 63
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p2, " but got instance of "

    .line 70
    .line 71
    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p2, "\nVerify that the adapter was registered for the correct type."

    .line 82
    .line 83
    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-direct {v6, p2}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v6
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    :catchall_0
    move-exception p1

    .line 95
    goto :goto_9

    .line 96
    :catch_0
    move-exception p1

    .line 97
    goto :goto_1

    .line 98
    :catch_1
    move-exception p1

    .line 99
    goto :goto_2

    .line 100
    :catch_2
    move-exception p1

    .line 101
    goto :goto_3

    .line 102
    :catch_3
    move-exception p2

    .line 103
    goto :goto_4

    .line 104
    :cond_2
    :goto_0
    invoke-virtual {v0, v3}, Ll1/a;->A(Lcom/google/gson/Strictness;)V

    .line 105
    .line 106
    .line 107
    goto :goto_5

    .line 108
    :goto_1
    :try_start_2
    new-instance p2, Ljava/lang/AssertionError;

    .line 109
    .line 110
    new-instance v2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-direct {p2, v1, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    throw p2

    .line 130
    :goto_2
    new-instance p2, Lcom/google/gson/JsonSyntaxException;

    .line 131
    .line 132
    invoke-direct {p2, p1}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    throw p2

    .line 136
    :goto_3
    new-instance p2, Lcom/google/gson/JsonSyntaxException;

    .line 137
    .line 138
    invoke-direct {p2, p1}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 142
    :catch_4
    move-exception p2

    .line 143
    const/4 p1, 0x1

    .line 144
    :goto_4
    if-eqz p1, :cond_5

    .line 145
    .line 146
    invoke-virtual {v0, v3}, Ll1/a;->A(Lcom/google/gson/Strictness;)V

    .line 147
    .line 148
    .line 149
    const/4 v5, 0x0

    .line 150
    :goto_5
    if-eqz v5, :cond_4

    .line 151
    .line 152
    :try_start_3
    invoke-virtual {v0}, Ll1/a;->x()Lcom/google/gson/stream/JsonToken;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    sget-object p2, Lcom/google/gson/stream/JsonToken;->END_DOCUMENT:Lcom/google/gson/stream/JsonToken;

    .line 157
    .line 158
    if-ne p1, p2, :cond_3

    .line 159
    .line 160
    goto :goto_8

    .line 161
    :cond_3
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    .line 162
    .line 163
    const-string p2, "JSON document was not fully consumed."

    .line 164
    .line 165
    invoke-direct {p1, p2}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw p1
    :try_end_3
    .catch Lcom/google/gson/stream/MalformedJsonException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    .line 169
    :catch_5
    move-exception p1

    .line 170
    goto :goto_6

    .line 171
    :catch_6
    move-exception p1

    .line 172
    goto :goto_7

    .line 173
    :goto_6
    new-instance p2, Lcom/google/gson/JsonIOException;

    .line 174
    .line 175
    invoke-direct {p2, p1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    throw p2

    .line 179
    :goto_7
    new-instance p2, Lcom/google/gson/JsonSyntaxException;

    .line 180
    .line 181
    invoke-direct {p2, p1}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    throw p2

    .line 185
    :cond_4
    :goto_8
    return-object v5

    .line 186
    :cond_5
    :try_start_4
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    .line 187
    .line 188
    invoke-direct {p1, p2}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 192
    :goto_9
    invoke-virtual {v0, v3}, Ll1/a;->A(Lcom/google/gson/Strictness;)V

    .line 193
    .line 194
    .line 195
    throw p1
.end method

.method public final c(Ljava/lang/String;Lk1/a;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, Ljava/io/StringReader;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, p2}, Lcom/google/gson/g;->b(Ljava/io/Reader;Lk1/a;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final d(Lk1/a;)Lcom/google/gson/p;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/gson/g;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcom/google/gson/p;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget-object v1, p0, Lcom/google/gson/g;->a:Ljava/lang/ThreadLocal;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ljava/util/Map;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    new-instance v2, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lcom/google/gson/p;

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    return-object v3

    .line 41
    :cond_2
    const/4 v3, 0x0

    .line 42
    :goto_0
    :try_start_0
    new-instance v4, Lcom/google/gson/f;

    .line 43
    .line 44
    invoke-direct {v4}, Lcom/google/gson/f;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object v5, p0, Lcom/google/gson/g;->e:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const/4 v6, 0x0

    .line 57
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_5

    .line 62
    .line 63
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    check-cast v6, Lcom/google/gson/q;

    .line 68
    .line 69
    invoke-interface {v6, p0, p1}, Lcom/google/gson/q;->c(Lcom/google/gson/g;Lk1/a;)Lcom/google/gson/p;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    if-eqz v6, :cond_3

    .line 74
    .line 75
    iget-object v5, v4, Lcom/google/gson/f;->a:Lcom/google/gson/p;

    .line 76
    .line 77
    if-nez v5, :cond_4

    .line 78
    .line 79
    iput-object v6, v4, Lcom/google/gson/f;->a:Lcom/google/gson/p;

    .line 80
    .line 81
    invoke-interface {v2, p1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    .line 88
    .line 89
    const-string v0, "Delegate is already set"

    .line 90
    .line 91
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    :cond_5
    :goto_1
    if-eqz v3, :cond_6

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 98
    .line 99
    .line 100
    :cond_6
    if-eqz v6, :cond_8

    .line 101
    .line 102
    if-eqz v3, :cond_7

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 105
    .line 106
    .line 107
    :cond_7
    return-object v6

    .line 108
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 109
    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v2, "GSON (2.13.1) cannot handle "

    .line 113
    .line 114
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v0

    .line 128
    :goto_2
    if-eqz v3, :cond_9

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 131
    .line 132
    .line 133
    :cond_9
    throw p1
.end method

.method public final e(Ljava/io/Writer;)Ll1/b;
    .locals 1

    .line 1
    new-instance v0, Ll1/b;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ll1/b;-><init>(Ljava/io/Writer;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/gson/g;->i:Lcom/google/gson/b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ll1/b;->m(Lcom/google/gson/b;)V

    .line 9
    .line 10
    .line 11
    iget-boolean p1, p0, Lcom/google/gson/g;->h:Z

    .line 12
    .line 13
    iput-boolean p1, v0, Ll1/b;->i:Z

    .line 14
    .line 15
    sget-object p1, Lcom/google/gson/Strictness;->LEGACY_STRICT:Lcom/google/gson/Strictness;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ll1/b;->n(Lcom/google/gson/Strictness;)V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, p0, Lcom/google/gson/g;->g:Z

    .line 21
    .line 22
    iput-boolean p1, v0, Ll1/b;->k:Z

    .line 23
    .line 24
    return-object v0
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Ljava/io/StringWriter;

    .line 4
    .line 5
    invoke-direct {p1}, Ljava/io/StringWriter;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/google/gson/g;->e(Ljava/io/Writer;)Ll1/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Lcom/google/gson/g;->h(Ll1/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :catch_0
    move-exception p1

    .line 21
    new-instance v0, Lcom/google/gson/JsonIOException;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Ljava/io/StringWriter;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    .line 34
    .line 35
    .line 36
    :try_start_1
    invoke-virtual {p0, v1}, Lcom/google/gson/g;->e(Ljava/io/Writer;)Ll1/b;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p0, p1, v0, v2}, Lcom/google/gson/g;->g(Ljava/lang/Object;Ljava/lang/Class;Ll1/b;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :catch_1
    move-exception p1

    .line 49
    new-instance v0, Lcom/google/gson/JsonIOException;

    .line 50
    .line 51
    invoke-direct {v0, p1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Class;Ll1/b;)V
    .locals 5

    .line 1
    const-string v0, "AssertionError (GSON 2.13.1): "

    .line 2
    .line 3
    new-instance v1, Lk1/a;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lcom/google/gson/g;->d(Lk1/a;)Lcom/google/gson/p;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iget-object v1, p3, Ll1/b;->h:Lcom/google/gson/Strictness;

    .line 13
    .line 14
    sget-object v2, Lcom/google/gson/Strictness;->LEGACY_STRICT:Lcom/google/gson/Strictness;

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    sget-object v2, Lcom/google/gson/Strictness;->LENIENT:Lcom/google/gson/Strictness;

    .line 19
    .line 20
    invoke-virtual {p3, v2}, Ll1/b;->n(Lcom/google/gson/Strictness;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-boolean v2, p3, Ll1/b;->i:Z

    .line 24
    .line 25
    iget-boolean v3, p3, Ll1/b;->k:Z

    .line 26
    .line 27
    iget-boolean v4, p0, Lcom/google/gson/g;->h:Z

    .line 28
    .line 29
    iput-boolean v4, p3, Ll1/b;->i:Z

    .line 30
    .line 31
    iget-boolean v4, p0, Lcom/google/gson/g;->g:Z

    .line 32
    .line 33
    iput-boolean v4, p3, Ll1/b;->k:Z

    .line 34
    .line 35
    :try_start_0
    invoke-virtual {p2, p3, p1}, Lcom/google/gson/p;->c(Ll1/b;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3, v1}, Ll1/b;->n(Lcom/google/gson/Strictness;)V

    .line 39
    .line 40
    .line 41
    iput-boolean v2, p3, Ll1/b;->i:Z

    .line 42
    .line 43
    iput-boolean v3, p3, Ll1/b;->k:Z

    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_0

    .line 48
    :catch_0
    move-exception p1

    .line 49
    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    .line 50
    .line 51
    new-instance v4, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {p2, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw p2

    .line 71
    :catch_1
    move-exception p1

    .line 72
    new-instance p2, Lcom/google/gson/JsonIOException;

    .line 73
    .line 74
    invoke-direct {p2, p1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    :goto_0
    invoke-virtual {p3, v1}, Ll1/b;->n(Lcom/google/gson/Strictness;)V

    .line 79
    .line 80
    .line 81
    iput-boolean v2, p3, Ll1/b;->i:Z

    .line 82
    .line 83
    iput-boolean v3, p3, Ll1/b;->k:Z

    .line 84
    .line 85
    throw p1
.end method

.method public final h(Ll1/b;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/google/gson/k;->a:Lcom/google/gson/k;

    .line 2
    .line 3
    const-string v1, "AssertionError (GSON 2.13.1): "

    .line 4
    .line 5
    iget-object v2, p1, Ll1/b;->h:Lcom/google/gson/Strictness;

    .line 6
    .line 7
    iget-boolean v3, p1, Ll1/b;->i:Z

    .line 8
    .line 9
    iget-boolean v4, p1, Ll1/b;->k:Z

    .line 10
    .line 11
    iget-boolean v5, p0, Lcom/google/gson/g;->h:Z

    .line 12
    .line 13
    iput-boolean v5, p1, Ll1/b;->i:Z

    .line 14
    .line 15
    iget-boolean v5, p0, Lcom/google/gson/g;->g:Z

    .line 16
    .line 17
    iput-boolean v5, p1, Ll1/b;->k:Z

    .line 18
    .line 19
    sget-object v5, Lcom/google/gson/Strictness;->LEGACY_STRICT:Lcom/google/gson/Strictness;

    .line 20
    .line 21
    if-ne v2, v5, :cond_0

    .line 22
    .line 23
    sget-object v5, Lcom/google/gson/Strictness;->LENIENT:Lcom/google/gson/Strictness;

    .line 24
    .line 25
    invoke-virtual {p1, v5}, Ll1/b;->n(Lcom/google/gson/Strictness;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    :try_start_0
    sget-object v5, Lg1/f1;->B:Lg1/n;

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v0}, Lg1/n;->f(Ll1/b;Lcom/google/gson/j;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v2}, Ll1/b;->n(Lcom/google/gson/Strictness;)V

    .line 37
    .line 38
    .line 39
    iput-boolean v3, p1, Ll1/b;->i:Z

    .line 40
    .line 41
    iput-boolean v4, p1, Ll1/b;->k:Z

    .line 42
    .line 43
    return-void

    .line 44
    :catch_0
    move-exception v0

    .line 45
    :try_start_1
    new-instance v5, Ljava/lang/AssertionError;

    .line 46
    .line 47
    new-instance v6, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-direct {v5, v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw v5

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto :goto_0

    .line 69
    :catch_1
    move-exception v0

    .line 70
    new-instance v1, Lcom/google/gson/JsonIOException;

    .line 71
    .line 72
    invoke-direct {v1, v0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    :goto_0
    invoke-virtual {p1, v2}, Ll1/b;->n(Lcom/google/gson/Strictness;)V

    .line 77
    .line 78
    .line 79
    iput-boolean v3, p1, Ll1/b;->i:Z

    .line 80
    .line 81
    iput-boolean v4, p1, Ll1/b;->k:Z

    .line 82
    .line 83
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string/jumbo v1, "{serializeNulls:"

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/google/gson/g;->g:Z

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ",factories:"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/google/gson/g;->e:Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ",instanceCreators:"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/google/gson/g;->c:Lcom/google/gson/internal/b;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string/jumbo v1, "}"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0
.end method
