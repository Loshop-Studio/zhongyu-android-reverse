.class public final Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;
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
        Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs$a;
    }
.end annotation


# static fields
.field public static final f:Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs$a;

.field public static final g:I


# instance fields
.field public final a:Lcom/zykj/study/bean/course/CourseBean;

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->f:Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->g:I

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/bean/course/CourseBean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "title"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->a:Lcom/zykj/study/bean/course/CourseBean;

    .line 15
    .line 16
    iput-boolean p2, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->b:Z

    .line 17
    .line 18
    iput-object p3, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->c:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p4, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->d:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p5, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->e:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;
    .locals 1

    sget-object v0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->f:Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/zykj/study/bean/course/CourseBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->a:Lcom/zykj/study/bean/course/CourseBean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->b:Z

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
    instance-of v1, p1, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->a:Lcom/zykj/study/bean/course/CourseBean;

    iget-object v3, p1, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->a:Lcom/zykj/study/bean/course/CourseBean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->b:Z

    iget-boolean v3, p1, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->e:Ljava/lang/String;

    iget-object p1, p1, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->e:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->a:Lcom/zykj/study/bean/course/CourseBean;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseBean;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->c:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->e:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->a:Lcom/zykj/study/bean/course/CourseBean;

    iget-boolean v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->b:Z

    iget-object v2, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->e:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "CourseContentFragmentArgs(courseBean="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isAuthor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", superviseId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", url="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
