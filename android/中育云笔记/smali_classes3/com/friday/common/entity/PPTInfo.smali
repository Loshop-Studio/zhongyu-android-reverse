.class public final Lcom/friday/common/entity/PPTInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final anim:Lcom/friday/common/entity/PPTAnim;

.field private final info:Ljava/lang/String;

.field private final page:Lcom/friday/common/entity/PPTPage;

.field private final url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/entity/PPTAnim;Ljava/lang/String;Lcom/friday/common/entity/PPTPage;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "anim"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "info"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "page"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "url"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/friday/common/entity/PPTInfo;->anim:Lcom/friday/common/entity/PPTAnim;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/friday/common/entity/PPTInfo;->info:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/friday/common/entity/PPTInfo;->page:Lcom/friday/common/entity/PPTPage;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/friday/common/entity/PPTInfo;->url:Ljava/lang/String;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/entity/PPTInfo;Lcom/friday/common/entity/PPTAnim;Ljava/lang/String;Lcom/friday/common/entity/PPTPage;Ljava/lang/String;ILjava/lang/Object;)Lcom/friday/common/entity/PPTInfo;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/friday/common/entity/PPTInfo;->anim:Lcom/friday/common/entity/PPTAnim;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/friday/common/entity/PPTInfo;->info:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/friday/common/entity/PPTInfo;->page:Lcom/friday/common/entity/PPTPage;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/friday/common/entity/PPTInfo;->url:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/friday/common/entity/PPTInfo;->copy(Lcom/friday/common/entity/PPTAnim;Ljava/lang/String;Lcom/friday/common/entity/PPTPage;Ljava/lang/String;)Lcom/friday/common/entity/PPTInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/friday/common/entity/PPTAnim;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/PPTInfo;->anim:Lcom/friday/common/entity/PPTAnim;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/PPTInfo;->info:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/friday/common/entity/PPTPage;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/PPTInfo;->page:Lcom/friday/common/entity/PPTPage;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/PPTInfo;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/friday/common/entity/PPTAnim;Ljava/lang/String;Lcom/friday/common/entity/PPTPage;Ljava/lang/String;)Lcom/friday/common/entity/PPTInfo;
    .locals 1

    const-string v0, "anim"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "page"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/friday/common/entity/PPTInfo;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/friday/common/entity/PPTInfo;-><init>(Lcom/friday/common/entity/PPTAnim;Ljava/lang/String;Lcom/friday/common/entity/PPTPage;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/entity/PPTInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/entity/PPTInfo;

    iget-object v1, p0, Lcom/friday/common/entity/PPTInfo;->anim:Lcom/friday/common/entity/PPTAnim;

    iget-object v3, p1, Lcom/friday/common/entity/PPTInfo;->anim:Lcom/friday/common/entity/PPTAnim;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/common/entity/PPTInfo;->info:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/PPTInfo;->info:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/common/entity/PPTInfo;->page:Lcom/friday/common/entity/PPTPage;

    iget-object v3, p1, Lcom/friday/common/entity/PPTInfo;->page:Lcom/friday/common/entity/PPTPage;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/friday/common/entity/PPTInfo;->url:Ljava/lang/String;

    iget-object p1, p1, Lcom/friday/common/entity/PPTInfo;->url:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAnim()Lcom/friday/common/entity/PPTAnim;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/PPTInfo;->anim:Lcom/friday/common/entity/PPTAnim;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInfo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/PPTInfo;->info:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPage()Lcom/friday/common/entity/PPTPage;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/PPTInfo;->page:Lcom/friday/common/entity/PPTPage;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/PPTInfo;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/friday/common/entity/PPTInfo;->anim:Lcom/friday/common/entity/PPTAnim;

    invoke-virtual {v0}, Lcom/friday/common/entity/PPTAnim;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/PPTInfo;->info:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/PPTInfo;->page:Lcom/friday/common/entity/PPTPage;

    invoke-virtual {v1}, Lcom/friday/common/entity/PPTPage;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/PPTInfo;->url:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/friday/common/entity/PPTInfo;->anim:Lcom/friday/common/entity/PPTAnim;

    iget-object v1, p0, Lcom/friday/common/entity/PPTInfo;->info:Ljava/lang/String;

    iget-object v2, p0, Lcom/friday/common/entity/PPTInfo;->page:Lcom/friday/common/entity/PPTPage;

    iget-object v3, p0, Lcom/friday/common/entity/PPTInfo;->url:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "PPTInfo(anim="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", info="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", page="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", url="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
