.class public final Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private localPath:Ljava/lang/String;

.field private final remoteUrl:Ljava/lang/String;

.field private final student:Lcom/friday/common/classtest/MqttResponse$Student;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/friday/common/classtest/MqttResponse$Student;Ljava/lang/String;)V
    .locals 1

    const-string v0, "remoteUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localPath"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->remoteUrl:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    .line 4
    iput-object p3, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->localPath:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/friday/common/classtest/MqttResponse$Student;Ljava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    const-string p3, ""

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;-><init>(Ljava/lang/String;Lcom/friday/common/classtest/MqttResponse$Student;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;Ljava/lang/String;Lcom/friday/common/classtest/MqttResponse$Student;Ljava/lang/String;ILjava/lang/Object;)Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->remoteUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->localPath:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->copy(Ljava/lang/String;Lcom/friday/common/classtest/MqttResponse$Student;Ljava/lang/String;)Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->remoteUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/friday/common/classtest/MqttResponse$Student;
    .locals 1

    iget-object v0, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->localPath:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/friday/common/classtest/MqttResponse$Student;Ljava/lang/String;)Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;
    .locals 1

    const-string v0, "remoteUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localPath"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    invoke-direct {v0, p1, p2, p3}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;-><init>(Ljava/lang/String;Lcom/friday/common/classtest/MqttResponse$Student;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    iget-object v1, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->remoteUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->remoteUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    iget-object v3, p1, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->localPath:Ljava/lang/String;

    iget-object p1, p1, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->localPath:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getLocalPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->localPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRemoteUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->remoteUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStudent()Lcom/friday/common/classtest/MqttResponse$Student;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->remoteUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Student;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->localPath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setLocalPath(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->localPath:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->remoteUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    iget-object v2, p0, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->localPath:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SubjectiveHomeworkAnswer(remoteUrl="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", student="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", localPath="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
