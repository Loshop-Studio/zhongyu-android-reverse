.class public final Le/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Le/c;


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Le/q/i/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Le/c;

    .line 3
    sget-object v2, Ld/e/i;->b:Ld/e/i;

    const-string v3, "$this$toSet"

    invoke-static {v0, v3}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v3

    if-eqz v3, :cond_4

    const/4 v2, 0x1

    if-eq v3, v2, :cond_3

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v3

    if-gez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x3

    if-ge v3, v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/high16 v4, 0x40000000    # 2.0f

    if-ge v3, v4, :cond_2

    int-to-float v3, v3

    const/high16 v4, 0x3f400000    # 0.75f

    div-float/2addr v3, v4

    const/high16 v4, 0x3f800000    # 1.0f

    add-float/2addr v3, v4

    float-to-int v3, v3

    goto :goto_0

    :cond_2
    const v3, 0x7fffffff

    :goto_0
    invoke-direct {v2, v3}, Ljava/util/LinkedHashSet;-><init>(I)V

    invoke-static {v0, v2}, Ld/e/e;->e(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 4
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    const-string v0, "java.util.Collections.singleton(element)"

    invoke-static {v2, v0}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    :goto_1
    const/4 v0, 0x0

    const/4 v3, 0x2

    .line 5
    invoke-direct {v1, v2, v0, v3}, Le/c;-><init>(Ljava/util/Set;Le/q/i/c;I)V

    .line 6
    sput-object v1, Le/c;->c:Le/c;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Le/q/i/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;",
            "Le/q/i/c;",
            ")V"
        }
    .end annotation

    const-string v0, "pins"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/c;->a:Ljava/util/Set;

    iput-object p2, p0, Le/c;->b:Le/q/i/c;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Le/q/i/c;I)V
    .locals 0

    and-int/lit8 p2, p3, 0x2

    const/4 p2, 0x0

    const-string p3, "pins"

    .line 1
    invoke-static {p1, p3}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/c;->a:Ljava/util/Set;

    iput-object p2, p0, Le/c;->b:Le/q/i/c;

    return-void
.end method


# virtual methods
.method public final a(Le/q/i/c;)Le/c;
    .locals 2

    const-string v0, "certificateChainCleaner"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/c;->b:Le/q/i/c;

    invoke-static {v0, p1}, Ld/f/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, Le/c;

    iget-object v1, p0, Le/c;->a:Ljava/util/Set;

    invoke-direct {v0, v1, p1}, Le/c;-><init>(Ljava/util/Set;Le/q/i/c;)V

    :goto_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Le/c;

    if-eqz v0, :cond_0

    check-cast p1, Le/c;

    iget-object v0, p1, Le/c;->a:Ljava/util/Set;

    iget-object v1, p0, Le/c;->a:Ljava/util/Set;

    invoke-static {v0, v1}, Ld/f/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Le/c;->b:Le/q/i/c;

    iget-object v0, p0, Le/c;->b:Le/q/i/c;

    invoke-static {p1, v0}, Ld/f/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Le/c;->a:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x5ed

    mul-int/lit8 v0, v0, 0x29

    iget-object v1, p0, Le/c;->b:Le/q/i/c;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method
