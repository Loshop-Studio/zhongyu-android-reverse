.class public final Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;
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
        Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u0000 \u00082\u00020\u0001:\u0001\u0015B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;",
        "Landroidx/navigation/NavArgs;",
        "",
        "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;",
        "categoryList",
        "<init>",
        "([Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V",
        "Landroid/os/Bundle;",
        "b",
        "()Landroid/os/Bundle;",
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
        "[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;",
        "()[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;",
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
.field public static final b:Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs$a;

.field public static final c:I


# instance fields
.field public final a:[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;->b:Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;->c:I

    return-void
.end method

.method public constructor <init>([Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V
    .locals 1

    .line 1
    const-string v0, "categoryList"

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
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;->a:[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 10
    .line 11
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;->b:Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;->a:[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;->a:[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 7
    .line 8
    check-cast v1, [Landroid/os/Parcelable;

    .line 9
    .line 10
    const-string v2, "categoryList"

    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;->a:[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    iget-object p1, p1, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;->a:[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;->a:[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;->a:[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "EditDialogFragmentArgs(categoryList="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
