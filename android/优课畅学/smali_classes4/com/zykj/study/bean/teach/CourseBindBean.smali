.class public final Lcom/zykj/study/bean/teach/CourseBindBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final id:I

.field private isBind:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "binded"
    .end annotation
.end field

.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Z)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->id:I

    .line 10
    .line 11
    iput-object p2, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->name:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p3, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->isBind:Z

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/teach/CourseBindBean;ILjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/study/bean/teach/CourseBindBean;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->id:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->isBind:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/bean/teach/CourseBindBean;->copy(ILjava/lang/String;Z)Lcom/zykj/study/bean/teach/CourseBindBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->isBind:Z

    return v0
.end method

.method public final copy(ILjava/lang/String;Z)Lcom/zykj/study/bean/teach/CourseBindBean;
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/study/bean/teach/CourseBindBean;

    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/study/bean/teach/CourseBindBean;-><init>(ILjava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/teach/CourseBindBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/teach/CourseBindBean;

    iget v1, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->id:I

    iget v3, p1, Lcom/zykj/study/bean/teach/CourseBindBean;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/CourseBindBean;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->isBind:Z

    iget-boolean p1, p1, Lcom/zykj/study/bean/teach/CourseBindBean;->isBind:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->id:I

    .line 2
    .line 3
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->isBind:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isBind()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->isBind:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setBind(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->isBind:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->id:I

    iget-object v1, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->name:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/zykj/study/bean/teach/CourseBindBean;->isBind:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CourseBindBean(id="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isBind="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
