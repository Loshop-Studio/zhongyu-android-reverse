.class public final Lcom/zykj/evaluation/ui/detail/GuideQuestion;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0014\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u00062\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0010\u00a8\u0006("
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/detail/GuideQuestion;",
        "Landroid/os/Parcelable;",
        "title",
        "",
        "description",
        "isRelatedGroup",
        "",
        "questionId",
        "",
        "groupId",
        "needRevise",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZJJZ)V",
        "getTitle",
        "()Ljava/lang/String;",
        "getDescription",
        "()Z",
        "getQuestionId",
        "()J",
        "getGroupId",
        "getNeedRevise",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "describeContents",
        "",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlinx/parcelize/Parcelize;
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/evaluation/ui/detail/GuideQuestion;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final description:Ljava/lang/String;

.field private final groupId:J

.field private final isRelatedGroup:Z

.field private final needRevise:Z

.field private final questionId:J

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/ui/detail/GuideQuestion$a;

    invoke-direct {v0}, Lcom/zykj/evaluation/ui/detail/GuideQuestion$a;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZJJZ)V
    .locals 1

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "description"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->title:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->description:Ljava/lang/String;

    .line 17
    .line 18
    iput-boolean p3, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->isRelatedGroup:Z

    .line 19
    .line 20
    iput-wide p4, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->questionId:J

    .line 21
    .line 22
    iput-wide p6, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->groupId:J

    .line 23
    .line 24
    iput-boolean p8, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->needRevise:Z

    .line 25
    .line 26
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/evaluation/ui/detail/GuideQuestion;Ljava/lang/String;Ljava/lang/String;ZJJZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/GuideQuestion;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->description:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-boolean p3, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->isRelatedGroup:Z

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-wide p4, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->questionId:J

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-wide p6, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->groupId:J

    :cond_4
    and-int/lit8 p9, p9, 0x20

    if-eqz p9, :cond_5

    iget-boolean p8, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->needRevise:Z

    :cond_5
    move p10, p8

    move-wide p8, p6

    move-wide p6, p4

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p10}, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->copy(Ljava/lang/String;Ljava/lang/String;ZJJZ)Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->isRelatedGroup:Z

    return v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->questionId:J

    return-wide v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->groupId:J

    return-wide v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->needRevise:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZJJZ)Lcom/zykj/evaluation/ui/detail/GuideQuestion;
    .locals 10

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    move-wide/from16 v7, p6

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/zykj/evaluation/ui/detail/GuideQuestion;-><init>(Ljava/lang/String;Ljava/lang/String;ZJJZ)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->isRelatedGroup:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->isRelatedGroup:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->questionId:J

    iget-wide v5, p1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->questionId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->groupId:J

    iget-wide v5, p1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->groupId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->needRevise:Z

    iget-boolean p1, p1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->needRevise:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGroupId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->groupId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getNeedRevise()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->needRevise:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getQuestionId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->questionId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->description:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->isRelatedGroup:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->questionId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->groupId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->needRevise:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isRelatedGroup()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->isRelatedGroup:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->description:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->isRelatedGroup:Z

    iget-wide v3, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->questionId:J

    iget-wide v5, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->groupId:J

    iget-boolean v7, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->needRevise:Z

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "GuideQuestion(title="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", description="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isRelatedGroup="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", questionId="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", groupId="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", needRevise="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->title:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->description:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->isRelatedGroup:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->questionId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->groupId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-boolean p2, p0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->needRevise:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
