.class public final Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;
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
        Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs$a;

.field public static final c:I


# instance fields
.field public final a:Lcom/zykj/study/data/MyCourseEntity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;->b:Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;->c:I

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/data/MyCourseEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;->a:Lcom/zykj/study/data/MyCourseEntity;

    .line 5
    .line 6
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;
    .locals 1

    sget-object v0, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;->b:Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/zykj/study/data/MyCourseEntity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;->a:Lcom/zykj/study/data/MyCourseEntity;

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
    instance-of v1, p1, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;

    iget-object v1, p0, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;->a:Lcom/zykj/study/data/MyCourseEntity;

    iget-object p1, p1, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;->a:Lcom/zykj/study/data/MyCourseEntity;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;->a:Lcom/zykj/study/data/MyCourseEntity;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/zykj/study/data/MyCourseEntity;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;->a:Lcom/zykj/study/data/MyCourseEntity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "EditCourseFragmentArgs(myCourseEntity="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
