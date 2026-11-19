.class public final Lcom/zykj/lib/login/bean/LoginInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final isTeacher:Z

.field private final needChangePwd:Z

.field private final needSendSms:Z

.field private final passwordStrength:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZZZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/zykj/lib/login/bean/LoginInfo;->isTeacher:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/zykj/lib/login/bean/LoginInfo;->needSendSms:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/zykj/lib/login/bean/LoginInfo;->needChangePwd:Z

    .line 9
    .line 10
    iput p4, p0, Lcom/zykj/lib/login/bean/LoginInfo;->passwordStrength:I

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/lib/login/bean/LoginInfo;ZZZIILjava/lang/Object;)Lcom/zykj/lib/login/bean/LoginInfo;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lcom/zykj/lib/login/bean/LoginInfo;->isTeacher:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/zykj/lib/login/bean/LoginInfo;->needSendSms:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/zykj/lib/login/bean/LoginInfo;->needChangePwd:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/zykj/lib/login/bean/LoginInfo;->passwordStrength:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/lib/login/bean/LoginInfo;->copy(ZZZI)Lcom/zykj/lib/login/bean/LoginInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/lib/login/bean/LoginInfo;->isTeacher:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/lib/login/bean/LoginInfo;->needSendSms:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/lib/login/bean/LoginInfo;->needChangePwd:Z

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/lib/login/bean/LoginInfo;->passwordStrength:I

    return v0
.end method

.method public final copy(ZZZI)Lcom/zykj/lib/login/bean/LoginInfo;
    .locals 1

    new-instance v0, Lcom/zykj/lib/login/bean/LoginInfo;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/zykj/lib/login/bean/LoginInfo;-><init>(ZZZI)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/lib/login/bean/LoginInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/lib/login/bean/LoginInfo;

    iget-boolean v1, p0, Lcom/zykj/lib/login/bean/LoginInfo;->isTeacher:Z

    iget-boolean v3, p1, Lcom/zykj/lib/login/bean/LoginInfo;->isTeacher:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/zykj/lib/login/bean/LoginInfo;->needSendSms:Z

    iget-boolean v3, p1, Lcom/zykj/lib/login/bean/LoginInfo;->needSendSms:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/lib/login/bean/LoginInfo;->needChangePwd:Z

    iget-boolean v3, p1, Lcom/zykj/lib/login/bean/LoginInfo;->needChangePwd:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/lib/login/bean/LoginInfo;->passwordStrength:I

    iget p1, p1, Lcom/zykj/lib/login/bean/LoginInfo;->passwordStrength:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getNeedChangePwd()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/lib/login/bean/LoginInfo;->needChangePwd:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getNeedSendSms()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/lib/login/bean/LoginInfo;->needSendSms:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getPasswordStrength()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/lib/login/bean/LoginInfo;->passwordStrength:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/zykj/lib/login/bean/LoginInfo;->isTeacher:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/lib/login/bean/LoginInfo;->needSendSms:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/lib/login/bean/LoginInfo;->needChangePwd:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/lib/login/bean/LoginInfo;->passwordStrength:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isTeacher()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/lib/login/bean/LoginInfo;->isTeacher:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lcom/zykj/lib/login/bean/LoginInfo;->isTeacher:Z

    iget-boolean v1, p0, Lcom/zykj/lib/login/bean/LoginInfo;->needSendSms:Z

    iget-boolean v2, p0, Lcom/zykj/lib/login/bean/LoginInfo;->needChangePwd:Z

    iget v3, p0, Lcom/zykj/lib/login/bean/LoginInfo;->passwordStrength:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "LoginInfo(isTeacher="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", needSendSms="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", needChangePwd="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", passwordStrength="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
