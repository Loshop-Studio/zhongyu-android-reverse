.class public Lcom/luck/picture/lib/widget/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/luck/picture/lib/widget/SlideSelectTouchListener$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luck/picture/lib/widget/a$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/luck/picture/lib/widget/a$a;

.field public b:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/widget/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/luck/picture/lib/widget/a;->a:Lcom/luck/picture/lib/widget/a$a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/luck/picture/lib/widget/a;->b:Ljava/util/HashSet;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/luck/picture/lib/widget/a;->a:Lcom/luck/picture/lib/widget/a$a;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/luck/picture/lib/widget/a$a;->getSelection()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/luck/picture/lib/widget/a;->b:Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/widget/a;->b:Ljava/util/HashSet;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/luck/picture/lib/widget/a;->a:Lcom/luck/picture/lib/widget/a$a;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/luck/picture/lib/widget/a;->b:Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x1

    .line 43
    xor-int/2addr v1, v2

    .line 44
    invoke-interface {v0, p1, p1, v1, v2}, Lcom/luck/picture/lib/widget/a$a;->a(IIZZ)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public b(IIZ)V
    .locals 2

    .line 1
    :goto_0
    if-gt p1, p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/luck/picture/lib/widget/a;->b:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eq p3, v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_1
    invoke-virtual {p0, p1, p1, v0}, Lcom/luck/picture/lib/widget/a;->d(IIZ)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/luck/picture/lib/widget/a;->b:Ljava/util/HashSet;

    .line 3
    .line 4
    return-void
.end method

.method public final d(IIZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/a;->a:Lcom/luck/picture/lib/widget/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, p1, p2, p3, v1}, Lcom/luck/picture/lib/widget/a$a;->a(IIZZ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
