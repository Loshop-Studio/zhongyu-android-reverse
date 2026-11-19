.class public final Lcom/zykj/mistake/main/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/mistake/main/TagEditorTarget;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:Lcom/zykj/mistake/main/a;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/main/TagEditorTarget;Ljava/util/List;Ljava/util/List;I)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 6
    sget-object p3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_0
    const/4 p4, 0x0

    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/mistake/main/a1;-><init>(Lcom/zykj/mistake/main/TagEditorTarget;Ljava/util/List;Ljava/util/List;Lcom/zykj/mistake/main/a;)V

    return-void
.end method

.method public constructor <init>(Lcom/zykj/mistake/main/TagEditorTarget;Ljava/util/List;Ljava/util/List;Lcom/zykj/mistake/main/a;)V
    .locals 1

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customTags"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialDisplayTags"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/mistake/main/a1;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/main/a1;->b:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lcom/zykj/mistake/main/a1;->c:Ljava/util/List;

    .line 5
    iput-object p4, p0, Lcom/zykj/mistake/main/a1;->d:Lcom/zykj/mistake/main/a;

    return-void
.end method

.method public static a(Lcom/zykj/mistake/main/a1;Ljava/util/List;Lcom/zykj/mistake/main/a;I)Lcom/zykj/mistake/main/a1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/main/a1;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/zykj/mistake/main/a1;->b:Ljava/util/List;

    .line 8
    .line 9
    :cond_0
    iget-object p3, p0, Lcom/zykj/mistake/main/a1;->c:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string p0, "target"

    .line 15
    .line 16
    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string p0, "customTags"

    .line 20
    .line 21
    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string p0, "initialDisplayTags"

    .line 25
    .line 26
    invoke-static {p3, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance p0, Lcom/zykj/mistake/main/a1;

    .line 30
    .line 31
    invoke-direct {p0, v0, p1, p3, p2}, Lcom/zykj/mistake/main/a1;-><init>(Lcom/zykj/mistake/main/TagEditorTarget;Ljava/util/List;Ljava/util/List;Lcom/zykj/mistake/main/a;)V

    .line 32
    .line 33
    .line 34
    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/main/a1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/main/a1;

    iget-object v1, p0, Lcom/zykj/mistake/main/a1;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    iget-object v3, p1, Lcom/zykj/mistake/main/a1;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/mistake/main/a1;->b:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/main/a1;->b:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/mistake/main/a1;->c:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/main/a1;->c:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/mistake/main/a1;->d:Lcom/zykj/mistake/main/a;

    iget-object p1, p1, Lcom/zykj/mistake/main/a1;->d:Lcom/zykj/mistake/main/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/main/a1;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lcom/zykj/mistake/main/a1;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/zykj/mistake/main/a1;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Lcom/zykj/mistake/main/a1;->d:Lcom/zykj/mistake/main/a;

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v1}, Lcom/zykj/mistake/main/a;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    :goto_0
    add-int/2addr v0, v1

    .line 33
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TagEditorState(target="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/zykj/mistake/main/a1;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customTags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/main/a1;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", initialDisplayTags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/main/a1;->c:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nameDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/main/a1;->d:Lcom/zykj/mistake/main/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
