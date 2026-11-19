.class public final Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;
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
        Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;",
        "Landroidx/navigation/NavArgs;",
        "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;",
        "category",
        "<init>",
        "(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;",
        "()Lcom/zykj/student/dialogue/bean/resp/CatalogResp;",
        "b",
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
.field public static final b:Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs$a;


# instance fields
.field public final a:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;->b:Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs$a;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V
    .locals 1

    .line 1
    const-string v0, "category"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;->a:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 10
    .line 11
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;->b:Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/zykj/student/dialogue/bean/resp/CatalogResp;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;->a:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

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
    instance-of v1, p1, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;->a:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    iget-object p1, p1, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;->a:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;->a:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    invoke-virtual {v0}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;->a:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UpdateCategoryFragmentArgs(category="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
