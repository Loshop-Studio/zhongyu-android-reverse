.class public final Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;
.super Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Custom"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u000b2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;",
        "customStart",
        "",
        "customEnd",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "getCustomStart",
        "()Ljava/lang/String;",
        "getCustomEnd",
        "hasTimeRange",
        "",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final customEnd:Ljava/lang/String;

.field private final customStart:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "customStart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customEnd"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    const-string v0, "\u81ea\u5b9a\u4e49"

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-object p1, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customStart:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customEnd:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    .line 2
    const-string v0, ""

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customStart:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customEnd:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->copy(Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customStart:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customEnd:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;
    .locals 1

    const-string v0, "customStart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customEnd"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;

    invoke-direct {v0, p1, p2}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customStart:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customStart:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customEnd:Ljava/lang/String;

    iget-object p1, p1, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customEnd:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCustomEnd()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customEnd:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCustomStart()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customStart:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final hasTimeRange()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;->getStart()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;->getEnd()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-lez v0, :cond_1

    .line 21
    .line 22
    :goto_0
    const/4 v0, 0x1

    .line 23
    return v0

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customStart:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customEnd:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customStart:Ljava/lang/String;

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;->customEnd:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Custom(customStart="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", customEnd="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
