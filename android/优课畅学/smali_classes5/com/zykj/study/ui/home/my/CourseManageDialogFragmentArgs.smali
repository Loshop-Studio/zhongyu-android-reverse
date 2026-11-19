.class public final Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/navigation/NavArgs;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs$a;


# instance fields
.field public final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;->b:Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs$a;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;->a:J

    .line 5
    .line 6
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;
    .locals 1

    sget-object v0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;->b:Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()Landroid/os/Bundle;
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "courseId"

    .line 7
    .line 8
    iget-wide v2, p0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;->a:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;

    iget-wide v3, p0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;->a:J

    iget-wide v5, p1, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;->a:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-wide v0, p0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;->a:J

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CourseManageDialogFragmentArgs(courseId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
