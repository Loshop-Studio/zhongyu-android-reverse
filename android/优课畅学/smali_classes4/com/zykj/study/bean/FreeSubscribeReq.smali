.class public final Lcom/zykj/study/bean/FreeSubscribeReq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/study/bean/FreeSubscribeReq;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final courseId:J

.field private learnDateTimeEnd:Ljava/lang/String;

.field private learnDateTimeStart:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private pageSize:I

.field private roleType:Ljava/lang/Integer;

.field private skipCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/study/bean/FreeSubscribeReq$Creator;

    invoke-direct {v0}, Lcom/zykj/study/bean/FreeSubscribeReq$Creator;-><init>()V

    sput-object v0, Lcom/zykj/study/bean/FreeSubscribeReq;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/bean/FreeSubscribeReq;->$stable:I

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->courseId:J

    .line 3
    iput-object p3, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->name:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->roleType:Ljava/lang/Integer;

    .line 5
    iput-object p5, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeStart:Ljava/lang/String;

    .line 6
    iput-object p6, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeEnd:Ljava/lang/String;

    .line 7
    iput p7, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->skipCount:I

    .line 8
    iput p8, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->pageSize:I

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/n;)V
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x20

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    move v7, p2

    goto :goto_0

    :cond_1
    move/from16 v7, p7

    :goto_0
    and-int/lit8 p1, p9, 0x40

    if-eqz p1, :cond_2

    move v8, p2

    :goto_1
    move-object v0, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    goto :goto_2

    :cond_2
    move/from16 v8, p8

    goto :goto_1

    .line 9
    :goto_2
    invoke-direct/range {v0 .. v8}, Lcom/zykj/study/bean/FreeSubscribeReq;-><init>(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/FreeSubscribeReq;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Lcom/zykj/study/bean/FreeSubscribeReq;
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->courseId:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->name:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p9, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->roleType:Ljava/lang/Integer;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeStart:Ljava/lang/String;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p9, 0x10

    if-eqz p1, :cond_4

    iget-object p6, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeEnd:Ljava/lang/String;

    :cond_4
    move-object v6, p6

    and-int/lit8 p1, p9, 0x20

    if-eqz p1, :cond_5

    iget p1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->skipCount:I

    move v7, p1

    goto :goto_0

    :cond_5
    move/from16 v7, p7

    :goto_0
    and-int/lit8 p1, p9, 0x40

    if-eqz p1, :cond_6

    iget p1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->pageSize:I

    move v8, p1

    :goto_1
    move-object v0, p0

    goto :goto_2

    :cond_6
    move/from16 v8, p8

    goto :goto_1

    :goto_2
    invoke-virtual/range {v0 .. v8}, Lcom/zykj/study/bean/FreeSubscribeReq;->copy(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;II)Lcom/zykj/study/bean/FreeSubscribeReq;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->courseId:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->roleType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeStart:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeEnd:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->skipCount:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->pageSize:I

    return v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;II)Lcom/zykj/study/bean/FreeSubscribeReq;
    .locals 9

    new-instance v0, Lcom/zykj/study/bean/FreeSubscribeReq;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/zykj/study/bean/FreeSubscribeReq;-><init>(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;II)V

    return-object v0
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
    instance-of v1, p1, Lcom/zykj/study/bean/FreeSubscribeReq;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/FreeSubscribeReq;

    iget-wide v3, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->courseId:J

    iget-wide v5, p1, Lcom/zykj/study/bean/FreeSubscribeReq;->courseId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/FreeSubscribeReq;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->roleType:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/zykj/study/bean/FreeSubscribeReq;->roleType:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeStart:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeStart:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeEnd:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeEnd:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->skipCount:I

    iget v3, p1, Lcom/zykj/study/bean/FreeSubscribeReq;->skipCount:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->pageSize:I

    iget p1, p1, Lcom/zykj/study/bean/FreeSubscribeReq;->pageSize:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCourseId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->courseId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getLearnDateTimeEnd()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeEnd:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLearnDateTimeStart()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeStart:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPageSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->pageSize:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRoleType()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->roleType:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSkipCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->skipCount:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->courseId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->name:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->roleType:Ljava/lang/Integer;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeStart:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeEnd:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->skipCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->pageSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setLearnDateTimeEnd(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeEnd:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setLearnDateTimeStart(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeStart:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setPageSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->pageSize:I

    .line 2
    .line 3
    return-void
.end method

.method public final setRoleType(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->roleType:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setSkipCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->skipCount:I

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-wide v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->courseId:J

    iget-object v2, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->name:Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->roleType:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeStart:Ljava/lang/String;

    iget-object v5, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeEnd:Ljava/lang/String;

    iget v6, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->skipCount:I

    iget v7, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->pageSize:I

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "FreeSubscribeReq(courseId="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", roleType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", learnDateTimeStart="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", learnDateTimeEnd="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", skipCount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", pageSize="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->courseId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->roleType:Ljava/lang/Integer;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :goto_1
    iget-object p2, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeStart:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->learnDateTimeEnd:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->skipCount:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/study/bean/FreeSubscribeReq;->pageSize:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
