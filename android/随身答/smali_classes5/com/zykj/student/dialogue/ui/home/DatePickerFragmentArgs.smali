.class public final Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/navigation/NavArgs;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 !2\u00020\u0001:\u0001\u0016BA\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0017\u001a\u0004\u0008\u001b\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0017\u001a\u0004\u0008\u001a\u0010\u0019R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;",
        "Landroidx/navigation/NavArgs;",
        "Ljava/util/Date;",
        "startDate",
        "endDate",
        "startTime",
        "endTime",
        "",
        "type",
        "",
        "isJoinedTime",
        "<init>",
        "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IZ)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/util/Date;",
        "c",
        "()Ljava/util/Date;",
        "b",
        "d",
        "e",
        "I",
        "f",
        "Z",
        "()Z",
        "g",
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
.field public static final g:Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs$a;

.field public static final h:I


# instance fields
.field public final a:Ljava/util/Date;

.field public final b:Ljava/util/Date;

.field public final c:Ljava/util/Date;

.field public final d:Ljava/util/Date;

.field public final e:I

.field public final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->g:Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->h:I

    return-void
.end method

.method public constructor <init>(Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->a:Ljava/util/Date;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->b:Ljava/util/Date;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->c:Ljava/util/Date;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->d:Ljava/util/Date;

    .line 11
    .line 12
    iput p5, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->e:I

    .line 13
    .line 14
    iput-boolean p6, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->f:Z

    .line 15
    .line 16
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->g:Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->b:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->d:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->a:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->c:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->a:Ljava/util/Date;

    iget-object v3, p1, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->a:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->b:Ljava/util/Date;

    iget-object v3, p1, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->b:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->c:Ljava/util/Date;

    iget-object v3, p1, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->c:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->d:Ljava/util/Date;

    iget-object v3, p1, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->d:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->e:I

    iget v3, p1, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->e:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->f:Z

    iget-boolean p1, p1, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->f:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->a:Ljava/util/Date;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->b:Ljava/util/Date;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->c:Ljava/util/Date;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->d:Ljava/util/Date;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->a:Ljava/util/Date;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->b:Ljava/util/Date;

    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->c:Ljava/util/Date;

    iget-object v3, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->d:Ljava/util/Date;

    iget v4, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->e:I

    iget-boolean v5, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->f:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "DatePickerFragmentArgs(startDate="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", endDate="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", startTime="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", endTime="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isJoinedTime="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
