.class public final Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Z

.field public final c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "detail"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->a:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->b:Z

    .line 17
    .line 18
    iput-object p3, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->c:Ljava/util/List;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->b:Z

    .line 2
    .line 3
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;

    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->b:Z

    iget-boolean v3, p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->c:Ljava/util/List;

    iget-object p1, p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->c:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->c:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->a:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->b:Z

    iget-object v2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->c:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "TheTabEntity(content="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isSelected="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", detail="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
