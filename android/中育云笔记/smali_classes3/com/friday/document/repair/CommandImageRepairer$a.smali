.class public final Lcom/friday/document/repair/CommandImageRepairer$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/repair/CommandImageRepairer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/friday/common/entity/ResourceEntity;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/friday/common/entity/ResourceEntity;)V
    .locals 1

    .line 1
    const-string v0, "localPath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "resource"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/friday/document/repair/CommandImageRepairer$a;->a:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/friday/document/repair/CommandImageRepairer$a;->b:Lcom/friday/common/entity/ResourceEntity;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/repair/CommandImageRepairer$a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lcom/friday/common/entity/ResourceEntity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/repair/CommandImageRepairer$a;->b:Lcom/friday/common/entity/ResourceEntity;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/document/repair/CommandImageRepairer$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/document/repair/CommandImageRepairer$a;

    iget-object v1, p0, Lcom/friday/document/repair/CommandImageRepairer$a;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/repair/CommandImageRepairer$a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/document/repair/CommandImageRepairer$a;->b:Lcom/friday/common/entity/ResourceEntity;

    iget-object p1, p1, Lcom/friday/document/repair/CommandImageRepairer$a;->b:Lcom/friday/common/entity/ResourceEntity;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/friday/document/repair/CommandImageRepairer$a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/repair/CommandImageRepairer$a;->b:Lcom/friday/common/entity/ResourceEntity;

    invoke-virtual {v1}, Lcom/friday/common/entity/ResourceEntity;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/friday/document/repair/CommandImageRepairer$a;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/friday/document/repair/CommandImageRepairer$a;->b:Lcom/friday/common/entity/ResourceEntity;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MissingImageTarget(localPath="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", resource="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
