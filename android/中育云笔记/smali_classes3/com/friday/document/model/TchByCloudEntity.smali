.class public final Lcom/friday/document/model/TchByCloudEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private isSelected:Z

.field private final picture:Ljava/lang/String;

.field private final teacherId:J

.field private final teacherName:Ljava/lang/String;

.field private final updateTime:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const-string v0, "teacherName"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "updateTime"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-wide p1, p0, Lcom/friday/document/model/TchByCloudEntity;->teacherId:J

    .line 15
    .line 16
    iput-object p3, p0, Lcom/friday/document/model/TchByCloudEntity;->teacherName:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p4, p0, Lcom/friday/document/model/TchByCloudEntity;->updateTime:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p5, p0, Lcom/friday/document/model/TchByCloudEntity;->picture:Ljava/lang/String;

    .line 21
    .line 22
    iput-boolean p6, p0, Lcom/friday/document/model/TchByCloudEntity;->isSelected:Z

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/document/model/TchByCloudEntity;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/friday/document/model/TchByCloudEntity;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lcom/friday/document/model/TchByCloudEntity;->teacherId:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/friday/document/model/TchByCloudEntity;->teacherName:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/friday/document/model/TchByCloudEntity;->updateTime:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/friday/document/model/TchByCloudEntity;->picture:Ljava/lang/String;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    iget-boolean p6, p0, Lcom/friday/document/model/TchByCloudEntity;->isSelected:Z

    :cond_4
    move-object v0, p0

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/friday/document/model/TchByCloudEntity;->copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/friday/document/model/TchByCloudEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/document/model/TchByCloudEntity;->teacherId:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/TchByCloudEntity;->teacherName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/TchByCloudEntity;->updateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/TchByCloudEntity;->picture:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/document/model/TchByCloudEntity;->isSelected:Z

    return v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/friday/document/model/TchByCloudEntity;
    .locals 8

    const-string v0, "teacherName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateTime"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/document/model/TchByCloudEntity;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/friday/document/model/TchByCloudEntity;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/document/model/TchByCloudEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/document/model/TchByCloudEntity;

    iget-wide v3, p0, Lcom/friday/document/model/TchByCloudEntity;->teacherId:J

    iget-wide v5, p1, Lcom/friday/document/model/TchByCloudEntity;->teacherId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/document/model/TchByCloudEntity;->teacherName:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/TchByCloudEntity;->teacherName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/document/model/TchByCloudEntity;->updateTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/TchByCloudEntity;->updateTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/friday/document/model/TchByCloudEntity;->picture:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/TchByCloudEntity;->picture:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/friday/document/model/TchByCloudEntity;->isSelected:Z

    iget-boolean p1, p1, Lcom/friday/document/model/TchByCloudEntity;->isSelected:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getPicture()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/TchByCloudEntity;->picture:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTeacherId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/document/model/TchByCloudEntity;->teacherId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTeacherName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/TchByCloudEntity;->teacherName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUpdateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/TchByCloudEntity;->updateTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/friday/document/model/TchByCloudEntity;->teacherId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/TchByCloudEntity;->teacherName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/TchByCloudEntity;->updateTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/TchByCloudEntity;->picture:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/document/model/TchByCloudEntity;->isSelected:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isSelected()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/document/model/TchByCloudEntity;->isSelected:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setSelected(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/document/model/TchByCloudEntity;->isSelected:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lcom/friday/document/model/TchByCloudEntity;->teacherId:J

    iget-object v2, p0, Lcom/friday/document/model/TchByCloudEntity;->teacherName:Ljava/lang/String;

    iget-object v3, p0, Lcom/friday/document/model/TchByCloudEntity;->updateTime:Ljava/lang/String;

    iget-object v4, p0, Lcom/friday/document/model/TchByCloudEntity;->picture:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/friday/document/model/TchByCloudEntity;->isSelected:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "TchByCloudEntity(teacherId="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", teacherName="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", updateTime="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", picture="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isSelected="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
