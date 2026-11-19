.class public final Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs;
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
        Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs$a;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs;->b:Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs$a;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs;
    .locals 1

    sget-object v0, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs;->b:Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs;

    iget v1, p0, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs;->a:I

    iget p1, p1, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs;->a:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs;->a:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AuthorizedLessonFragmentArgs(courseId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
