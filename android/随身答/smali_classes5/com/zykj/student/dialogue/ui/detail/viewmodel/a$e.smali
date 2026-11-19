.class public final Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$e;
.super Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;)V
    .locals 1

    .line 1
    const-string v0, "tab"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$e;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$e;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$e;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$e;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    iget-object p1, p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$e;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$e;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$e;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TabSwitch(tab="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
