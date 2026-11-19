.class public final Lb/b/b/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/b/b/i$a;
    }
.end annotation


# static fields
.field public static final f:Lb/b/b/b0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/b/b0/a<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/util/Map<",
            "Lb/b/b/b0/a<",
            "*>;",
            "Lb/b/b/i$a<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lb/b/b/b0/a<",
            "*>;",
            "Lb/b/b/x<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final c:Lb/b/b/a0/g;

.field public final d:Lb/b/b/a0/z/d;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb/b/b/y;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Ljava/lang/Object;

    .line 1
    new-instance v1, Lb/b/b/b0/a;

    invoke-direct {v1, v0}, Lb/b/b/b0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 2
    sput-object v1, Lb/b/b/i;->f:Lb/b/b/b0/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    sget-object v0, Lb/b/b/a0/o;->d:Lb/b/b/a0/o;

    sget-object v1, Lb/b/b/c;->b:Lb/b/b/c;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v4, Ljava/lang/ThreadLocal;

    invoke-direct {v4}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v4, p0, Lb/b/b/i;->a:Ljava/lang/ThreadLocal;

    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v4, p0, Lb/b/b/i;->b:Ljava/util/Map;

    new-instance v4, Lb/b/b/a0/g;

    invoke-direct {v4, v2}, Lb/b/b/a0/g;-><init>(Ljava/util/Map;)V

    iput-object v4, p0, Lb/b/b/i;->c:Lb/b/b/a0/g;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    sget-object v5, Lb/b/b/a0/z/o;->Y:Lb/b/b/y;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Lb/b/b/a0/z/h;->b:Lb/b/b/y;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object v3, Lb/b/b/a0/z/o;->D:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->m:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->g:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->i:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->k:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    sget-object v3, Lb/b/b/a0/z/o;->t:Lb/b/b/x;

    .line 3
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v6, Ljava/lang/Long;

    .line 4
    new-instance v7, Lb/b/b/a0/z/q;

    invoke-direct {v7, v5, v6, v3}, Lb/b/b/a0/z/q;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lb/b/b/x;)V

    .line 5
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v6, Ljava/lang/Double;

    .line 6
    new-instance v7, Lb/b/b/e;

    invoke-direct {v7, p0}, Lb/b/b/e;-><init>(Lb/b/b/i;)V

    .line 7
    new-instance v8, Lb/b/b/a0/z/q;

    invoke-direct {v8, v5, v6, v7}, Lb/b/b/a0/z/q;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lb/b/b/x;)V

    .line 8
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v6, Ljava/lang/Float;

    .line 9
    new-instance v7, Lb/b/b/f;

    invoke-direct {v7, p0}, Lb/b/b/f;-><init>(Lb/b/b/i;)V

    .line 10
    new-instance v8, Lb/b/b/a0/z/q;

    invoke-direct {v8, v5, v6, v7}, Lb/b/b/a0/z/q;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lb/b/b/x;)V

    .line 11
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Lb/b/b/a0/z/o;->x:Lb/b/b/y;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Lb/b/b/a0/z/o;->o:Lb/b/b/y;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Lb/b/b/a0/z/o;->q:Lb/b/b/y;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-class v5, Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    new-instance v6, Lb/b/b/g;

    invoke-direct {v6, v3}, Lb/b/b/g;-><init>(Lb/b/b/x;)V

    .line 13
    new-instance v7, Lb/b/b/w;

    invoke-direct {v7, v6}, Lb/b/b/w;-><init>(Lb/b/b/x;)V

    .line 14
    new-instance v6, Lb/b/b/a0/z/p;

    invoke-direct {v6, v5, v7}, Lb/b/b/a0/z/p;-><init>(Ljava/lang/Class;Lb/b/b/x;)V

    .line 15
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-class v5, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 16
    new-instance v6, Lb/b/b/h;

    invoke-direct {v6, v3}, Lb/b/b/h;-><init>(Lb/b/b/x;)V

    .line 17
    new-instance v3, Lb/b/b/w;

    invoke-direct {v3, v6}, Lb/b/b/w;-><init>(Lb/b/b/x;)V

    .line 18
    new-instance v6, Lb/b/b/a0/z/p;

    invoke-direct {v6, v5, v3}, Lb/b/b/a0/z/p;-><init>(Ljava/lang/Class;Lb/b/b/x;)V

    .line 19
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->s:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->z:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->F:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->H:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-class v3, Ljava/math/BigDecimal;

    sget-object v5, Lb/b/b/a0/z/o;->B:Lb/b/b/x;

    .line 20
    new-instance v6, Lb/b/b/a0/z/p;

    invoke-direct {v6, v3, v5}, Lb/b/b/a0/z/p;-><init>(Ljava/lang/Class;Lb/b/b/x;)V

    .line 21
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-class v3, Ljava/math/BigInteger;

    sget-object v5, Lb/b/b/a0/z/o;->C:Lb/b/b/x;

    .line 22
    new-instance v6, Lb/b/b/a0/z/p;

    invoke-direct {v6, v3, v5}, Lb/b/b/a0/z/p;-><init>(Ljava/lang/Class;Lb/b/b/x;)V

    .line 23
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->J:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->L:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->P:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->R:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->W:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->N:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->d:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/c;->b:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->U:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/l;->b:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/k;->b:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->S:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/a;->c:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lb/b/b/a0/z/o;->b:Lb/b/b/y;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lb/b/b/a0/z/b;

    invoke-direct {v3, v4}, Lb/b/b/a0/z/b;-><init>(Lb/b/b/a0/g;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lb/b/b/a0/z/g;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lb/b/b/a0/z/g;-><init>(Lb/b/b/a0/g;Z)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lb/b/b/a0/z/d;

    invoke-direct {v3, v4}, Lb/b/b/a0/z/d;-><init>(Lb/b/b/a0/g;)V

    iput-object v3, p0, Lb/b/b/i;->d:Lb/b/b/a0/z/d;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Lb/b/b/a0/z/o;->Z:Lb/b/b/y;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Lb/b/b/a0/z/j;

    invoke-direct {v5, v4, v1, v0, v3}, Lb/b/b/a0/z/j;-><init>(Lb/b/b/a0/g;Lb/b/b/d;Lb/b/b/a0/o;Lb/b/b/a0/z/d;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lb/b/b/i;->e:Ljava/util/List;

    return-void
.end method

.method public static a(D)V
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto/16 :goto_2

    .line 1
    :cond_0
    new-instance v1, Ljava/io/StringReader;

    invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance p1, Lb/b/b/c0/a;

    invoke-direct {p1, v1}, Lb/b/b/c0/a;-><init>(Ljava/io/Reader;)V

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p1, Lb/b/b/c0/a;->c:Z

    const/4 v2, 0x1

    .line 4
    iput-boolean v2, p1, Lb/b/b/c0/a;->c:Z

    .line 5
    :try_start_0
    invoke-virtual {p1}, Lb/b/b/c0/a;->v()Lb/b/b/c0/b;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :try_start_1
    new-instance v2, Lb/b/b/b0/a;

    invoke-direct {v2, p2}, Lb/b/b/b0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 7
    invoke-virtual {p0, v2}, Lb/b/b/i;->c(Lb/b/b/b0/a;)Lb/b/b/x;

    move-result-object v2

    invoke-virtual {v2, p1}, Lb/b/b/x;->a(Lb/b/b/c0/a;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v2

    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p2

    goto/16 :goto_4

    :catch_1
    move-exception p2

    :try_start_2
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AssertionError (GSON 2.8.6): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0

    :catch_2
    move-exception p2

    new-instance v0, Lb/b/b/v;

    invoke-direct {v0, p2}, Lb/b/b/v;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p2

    new-instance v0, Lb/b/b/v;

    invoke-direct {v0, p2}, Lb/b/b/v;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_4
    move-exception v3

    move-object v4, v3

    move v3, v2

    move-object v2, v4

    :goto_0
    if-eqz v3, :cond_c

    .line 8
    :goto_1
    iput-boolean v1, p1, Lb/b/b/c0/a;->c:Z

    if-eqz v0, :cond_2

    .line 9
    :try_start_3
    invoke-virtual {p1}, Lb/b/b/c0/a;->v()Lb/b/b/c0/b;

    move-result-object p1

    sget-object v1, Lb/b/b/c0/b;->k:Lb/b/b/c0/b;

    if-ne p1, v1, :cond_1

    goto :goto_2

    :cond_1
    new-instance p1, Lb/b/b/o;

    const-string p2, "JSON document was not fully consumed."

    invoke-direct {p1, p2}, Lb/b/b/o;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catch Lb/b/b/c0/d; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    :catch_5
    move-exception p1

    new-instance p2, Lb/b/b/o;

    invoke-direct {p2, p1}, Lb/b/b/o;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_6
    move-exception p1

    new-instance p2, Lb/b/b/v;

    invoke-direct {p2, p1}, Lb/b/b/v;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 10
    :cond_2
    :goto_2
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p2, p1, :cond_3

    const-class p1, Ljava/lang/Integer;

    goto :goto_3

    :cond_3
    sget-object p1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne p2, p1, :cond_4

    const-class p1, Ljava/lang/Float;

    goto :goto_3

    :cond_4
    sget-object p1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne p2, p1, :cond_5

    const-class p1, Ljava/lang/Byte;

    goto :goto_3

    :cond_5
    sget-object p1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne p2, p1, :cond_6

    const-class p1, Ljava/lang/Double;

    goto :goto_3

    :cond_6
    sget-object p1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne p2, p1, :cond_7

    const-class p1, Ljava/lang/Long;

    goto :goto_3

    :cond_7
    sget-object p1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne p2, p1, :cond_8

    const-class p1, Ljava/lang/Character;

    goto :goto_3

    :cond_8
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne p2, p1, :cond_9

    const-class p1, Ljava/lang/Boolean;

    goto :goto_3

    :cond_9
    sget-object p1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne p2, p1, :cond_a

    const-class p1, Ljava/lang/Short;

    goto :goto_3

    :cond_a
    sget-object p1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne p2, p1, :cond_b

    const-class p2, Ljava/lang/Void;

    :cond_b
    move-object p1, p2

    .line 11
    :goto_3
    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 12
    :cond_c
    :try_start_4
    new-instance p2, Lb/b/b/v;

    invoke-direct {p2, v2}, Lb/b/b/v;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 13
    :goto_4
    iput-boolean v1, p1, Lb/b/b/c0/a;->c:Z

    .line 14
    throw p2
.end method

.method public c(Lb/b/b/b0/a;)Lb/b/b/x;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lb/b/b/b0/a<",
            "TT;>;)",
            "Lb/b/b/x<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lb/b/b/i;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/b/b/x;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lb/b/b/i;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lb/b/b/i;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v1, 0x1

    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/b/b/i$a;

    if-eqz v2, :cond_2

    return-object v2

    :cond_2
    :try_start_0
    new-instance v2, Lb/b/b/i$a;

    invoke-direct {v2}, Lb/b/b/i$a;-><init>()V

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lb/b/b/i;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb/b/b/y;

    invoke-interface {v4, p0, p1}, Lb/b/b/y;->a(Lb/b/b/i;Lb/b/b/b0/a;)Lb/b/b/x;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 1
    iget-object v3, v2, Lb/b/b/i$a;->a:Lb/b/b/x;

    if-nez v3, :cond_5

    iput-object v4, v2, Lb/b/b/i$a;->a:Lb/b/b/x;

    .line 2
    iget-object v2, p0, Lb/b/b/i;->b:Ljava/util/Map;

    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_4

    iget-object p1, p0, Lb/b/b/i;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_4
    return-object v4

    .line 3
    :cond_5
    :try_start_1
    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 4
    :cond_6
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "GSON (2.8.6) cannot handle "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v2

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_7

    iget-object p1, p0, Lb/b/b/i;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_7
    throw v2
.end method

.method public d(Lb/b/b/y;Lb/b/b/b0/a;)Lb/b/b/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lb/b/b/y;",
            "Lb/b/b/b0/a<",
            "TT;>;)",
            "Lb/b/b/x<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lb/b/b/i;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lb/b/b/i;->d:Lb/b/b/a0/z/d;

    :cond_0
    const/4 v0, 0x0

    iget-object v1, p0, Lb/b/b/i;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/b/b/y;

    if-nez v0, :cond_2

    if-ne v2, p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v2, p0, p2}, Lb/b/b/y;->a(Lb/b/b/i;Lb/b/b/b0/a;)Lb/b/b/x;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GSON cannot serialize "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{serializeNulls:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",factories:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/b/b/i;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/b/b/i;->c:Lb/b/b/a0/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
