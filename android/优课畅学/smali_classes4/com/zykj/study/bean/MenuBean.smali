.class public final Lcom/zykj/study/bean/MenuBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private mNormalIcon:I

.field private mSelectIcon:I

.field private mTitle:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0
    .param p3    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/zykj/study/bean/MenuBean;->mNormalIcon:I

    .line 3
    iput p2, p0, Lcom/zykj/study/bean/MenuBean;->mSelectIcon:I

    .line 4
    iput p3, p0, Lcom/zykj/study/bean/MenuBean;->mTitle:I

    return-void
.end method

.method public synthetic constructor <init>(IIIILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    move p2, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/study/bean/MenuBean;-><init>(III)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/MenuBean;IIIILjava/lang/Object;)Lcom/zykj/study/bean/MenuBean;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/zykj/study/bean/MenuBean;->mNormalIcon:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/zykj/study/bean/MenuBean;->mSelectIcon:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/zykj/study/bean/MenuBean;->mTitle:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/bean/MenuBean;->copy(III)Lcom/zykj/study/bean/MenuBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/MenuBean;->mNormalIcon:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/MenuBean;->mSelectIcon:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/MenuBean;->mTitle:I

    return v0
.end method

.method public final copy(III)Lcom/zykj/study/bean/MenuBean;
    .locals 1
    .param p3    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param

    new-instance v0, Lcom/zykj/study/bean/MenuBean;

    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/study/bean/MenuBean;-><init>(III)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/MenuBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/MenuBean;

    iget v1, p0, Lcom/zykj/study/bean/MenuBean;->mNormalIcon:I

    iget v3, p1, Lcom/zykj/study/bean/MenuBean;->mNormalIcon:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/bean/MenuBean;->mSelectIcon:I

    iget v3, p1, Lcom/zykj/study/bean/MenuBean;->mSelectIcon:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/study/bean/MenuBean;->mTitle:I

    iget p1, p1, Lcom/zykj/study/bean/MenuBean;->mTitle:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMNormalIcon()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/MenuBean;->mNormalIcon:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMSelectIcon()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/MenuBean;->mSelectIcon:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMTitle()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/MenuBean;->mTitle:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/bean/MenuBean;->mNormalIcon:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/MenuBean;->mSelectIcon:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/MenuBean;->mTitle:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMNormalIcon(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/MenuBean;->mNormalIcon:I

    .line 2
    .line 3
    return-void
.end method

.method public final setMSelectIcon(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/MenuBean;->mSelectIcon:I

    .line 2
    .line 3
    return-void
.end method

.method public final setMTitle(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/MenuBean;->mTitle:I

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/zykj/study/bean/MenuBean;->mNormalIcon:I

    iget v1, p0, Lcom/zykj/study/bean/MenuBean;->mSelectIcon:I

    iget v2, p0, Lcom/zykj/study/bean/MenuBean;->mTitle:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MenuBean(mNormalIcon="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mSelectIcon="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mTitle="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
