.class public final Lcom/zykj/study/bean/exercise/ChoiceBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final showStatus:Lcom/zykj/study/bean/exercise/ChoiceStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V
    .locals 1

    .line 1
    const-string v0, "showStatus"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/bean/exercise/ChoiceBean;->showStatus:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/exercise/ChoiceBean;Lcom/zykj/study/bean/exercise/ChoiceStatus;ILjava/lang/Object;)Lcom/zykj/study/bean/exercise/ChoiceBean;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/zykj/study/bean/exercise/ChoiceBean;->showStatus:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/study/bean/exercise/ChoiceBean;->copy(Lcom/zykj/study/bean/exercise/ChoiceStatus;)Lcom/zykj/study/bean/exercise/ChoiceBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/zykj/study/bean/exercise/ChoiceStatus;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ChoiceBean;->showStatus:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    return-object v0
.end method

.method public final copy(Lcom/zykj/study/bean/exercise/ChoiceStatus;)Lcom/zykj/study/bean/exercise/ChoiceBean;
    .locals 1

    const-string v0, "showStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/study/bean/exercise/ChoiceBean;

    invoke-direct {v0, p1}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/exercise/ChoiceBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/exercise/ChoiceBean;

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/ChoiceBean;->showStatus:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    iget-object p1, p1, Lcom/zykj/study/bean/exercise/ChoiceBean;->showStatus:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getShowStatus()Lcom/zykj/study/bean/exercise/ChoiceStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ChoiceBean;->showStatus:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ChoiceBean;->showStatus:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ChoiceBean;->showStatus:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ChoiceBean(showStatus="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
