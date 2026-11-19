.class public final Lcom/zykj/study/bean/OssTokenReq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final fc:I

.field private final fe:Ljava/lang/String;

.field private final fo:Ljava/lang/String;

.field private final fr:I

.field private final ft:I

.field private final nonce:Ljava/lang/String;

.field private final sign:Ljava/lang/String;

.field private final ts:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    const-string v0, "fe"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fo"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nonce"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sign"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/zykj/study/bean/OssTokenReq;->fc:I

    .line 3
    iput p2, p0, Lcom/zykj/study/bean/OssTokenReq;->ft:I

    .line 4
    iput-object p3, p0, Lcom/zykj/study/bean/OssTokenReq;->fe:Ljava/lang/String;

    .line 5
    iput p4, p0, Lcom/zykj/study/bean/OssTokenReq;->fr:I

    .line 6
    iput-object p5, p0, Lcom/zykj/study/bean/OssTokenReq;->fo:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/zykj/study/bean/OssTokenReq;->nonce:Ljava/lang/String;

    .line 8
    iput-wide p7, p0, Lcom/zykj/study/bean/OssTokenReq;->ts:J

    .line 9
    iput-object p9, p0, Lcom/zykj/study/bean/OssTokenReq;->sign:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p10, p10, 0x1

    if-eqz p10, :cond_0

    const/4 p1, 0x5

    :cond_0
    move-object p11, p9

    move-wide p9, p7

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    .line 10
    invoke-direct/range {p2 .. p11}, Lcom/zykj/study/bean/OssTokenReq;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/OssTokenReq;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/study/bean/OssTokenReq;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/zykj/study/bean/OssTokenReq;->fc:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget p2, p0, Lcom/zykj/study/bean/OssTokenReq;->ft:I

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/zykj/study/bean/OssTokenReq;->fe:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget p4, p0, Lcom/zykj/study/bean/OssTokenReq;->fr:I

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/zykj/study/bean/OssTokenReq;->fo:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/zykj/study/bean/OssTokenReq;->nonce:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-wide p7, p0, Lcom/zykj/study/bean/OssTokenReq;->ts:J

    :cond_6
    and-int/lit16 p10, p10, 0x80

    if-eqz p10, :cond_7

    iget-object p9, p0, Lcom/zykj/study/bean/OssTokenReq;->sign:Ljava/lang/String;

    :cond_7
    move-object p11, p9

    move-wide p9, p7

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p11}, Lcom/zykj/study/bean/OssTokenReq;->copy(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/zykj/study/bean/OssTokenReq;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/OssTokenReq;->fc:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/OssTokenReq;->ft:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/OssTokenReq;->fe:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/OssTokenReq;->fr:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/OssTokenReq;->fo:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/OssTokenReq;->nonce:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/OssTokenReq;->ts:J

    return-wide v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/OssTokenReq;->sign:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/zykj/study/bean/OssTokenReq;
    .locals 11

    const-string v0, "fe"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fo"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nonce"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sign"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/bean/OssTokenReq;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-wide/from16 v8, p7

    invoke-direct/range {v1 .. v10}, Lcom/zykj/study/bean/OssTokenReq;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/OssTokenReq;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/OssTokenReq;

    iget v1, p0, Lcom/zykj/study/bean/OssTokenReq;->fc:I

    iget v3, p1, Lcom/zykj/study/bean/OssTokenReq;->fc:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/bean/OssTokenReq;->ft:I

    iget v3, p1, Lcom/zykj/study/bean/OssTokenReq;->ft:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/bean/OssTokenReq;->fe:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/OssTokenReq;->fe:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/study/bean/OssTokenReq;->fr:I

    iget v3, p1, Lcom/zykj/study/bean/OssTokenReq;->fr:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/study/bean/OssTokenReq;->fo:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/OssTokenReq;->fo:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/study/bean/OssTokenReq;->nonce:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/OssTokenReq;->nonce:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/zykj/study/bean/OssTokenReq;->ts:J

    iget-wide v5, p1, Lcom/zykj/study/bean/OssTokenReq;->ts:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/study/bean/OssTokenReq;->sign:Ljava/lang/String;

    iget-object p1, p1, Lcom/zykj/study/bean/OssTokenReq;->sign:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getFc()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/OssTokenReq;->fc:I

    .line 2
    .line 3
    return v0
.end method

.method public final getFe()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/OssTokenReq;->fe:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/OssTokenReq;->fo:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFr()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/OssTokenReq;->fr:I

    .line 2
    .line 3
    return v0
.end method

.method public final getFt()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/OssTokenReq;->ft:I

    .line 2
    .line 3
    return v0
.end method

.method public final getNonce()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/OssTokenReq;->nonce:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSign()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/OssTokenReq;->sign:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTs()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/OssTokenReq;->ts:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/zykj/study/bean/OssTokenReq;->fc:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/OssTokenReq;->ft:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/OssTokenReq;->fe:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/OssTokenReq;->fr:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/OssTokenReq;->fo:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/OssTokenReq;->nonce:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/study/bean/OssTokenReq;->ts:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/OssTokenReq;->sign:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget v0, p0, Lcom/zykj/study/bean/OssTokenReq;->fc:I

    iget v1, p0, Lcom/zykj/study/bean/OssTokenReq;->ft:I

    iget-object v2, p0, Lcom/zykj/study/bean/OssTokenReq;->fe:Ljava/lang/String;

    iget v3, p0, Lcom/zykj/study/bean/OssTokenReq;->fr:I

    iget-object v4, p0, Lcom/zykj/study/bean/OssTokenReq;->fo:Ljava/lang/String;

    iget-object v5, p0, Lcom/zykj/study/bean/OssTokenReq;->nonce:Ljava/lang/String;

    iget-wide v6, p0, Lcom/zykj/study/bean/OssTokenReq;->ts:J

    iget-object v8, p0, Lcom/zykj/study/bean/OssTokenReq;->sign:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "OssTokenReq(fc="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", ft="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", fe="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fr="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", fo="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", nonce="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ts="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", sign="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
