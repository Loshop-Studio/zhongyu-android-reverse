.class public final Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final superviseGroup:Lcom/zykj/study/bean/teach/SuperviseGroup;

.field private final superviseGroupMember:Lcom/zykj/study/bean/teach/SuperviseGroupMember;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V
    .locals 1

    .line 1
    const-string v0, "superviseGroup"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "superviseGroupMember"

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
    iput-object p1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroup:Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroupMember:Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;ILjava/lang/Object;)Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroup:Lcom/zykj/study/bean/teach/SuperviseGroup;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroupMember:Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->copy(Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/zykj/study/bean/teach/SuperviseGroup;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroup:Lcom/zykj/study/bean/teach/SuperviseGroup;

    return-object v0
.end method

.method public final component2()Lcom/zykj/study/bean/teach/SuperviseGroupMember;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroupMember:Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    return-object v0
.end method

.method public final copy(Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;
    .locals 1

    const-string v0, "superviseGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "superviseGroupMember"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;

    invoke-direct {v0, p1, p2}, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;-><init>(Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroup:Lcom/zykj/study/bean/teach/SuperviseGroup;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroup:Lcom/zykj/study/bean/teach/SuperviseGroup;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroupMember:Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    iget-object p1, p1, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroupMember:Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getSuperviseGroup()Lcom/zykj/study/bean/teach/SuperviseGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroup:Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSuperviseGroupMember()Lcom/zykj/study/bean/teach/SuperviseGroupMember;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroupMember:Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroup:Lcom/zykj/study/bean/teach/SuperviseGroup;

    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroup;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroupMember:Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    invoke-virtual {v1}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroup:Lcom/zykj/study/bean/teach/SuperviseGroup;

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->superviseGroupMember:Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SuperviseGroupSelectBean(superviseGroup="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", superviseGroupMember="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
