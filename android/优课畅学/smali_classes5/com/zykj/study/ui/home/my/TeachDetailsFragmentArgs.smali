.class public final Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;
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
        Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs$a;

.field public static final d:I


# instance fields
.field public final a:I

.field public final b:Lcom/zykj/study/bean/course/CourseBean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->c:Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->d:I

    return-void
.end method

.method public constructor <init>(ILcom/zykj/study/bean/course/CourseBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->b:Lcom/zykj/study/bean/course/CourseBean;

    .line 7
    .line 8
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;
    .locals 1

    sget-object v0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->c:Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/zykj/study/bean/course/CourseBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->b:Lcom/zykj/study/bean/course/CourseBean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->a:I

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
    instance-of v1, p1, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;

    iget v1, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->a:I

    iget v3, p1, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->b:Lcom/zykj/study/bean/course/CourseBean;

    iget-object p1, p1, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->b:Lcom/zykj/study/bean/course/CourseBean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->b:Lcom/zykj/study/bean/course/CourseBean;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CourseBean;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->a:I

    iget-object v1, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->b:Lcom/zykj/study/bean/course/CourseBean;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TeachDetailsFragmentArgs(superviseId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", courseBean="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
