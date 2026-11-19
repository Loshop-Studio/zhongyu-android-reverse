.class public abstract Lcom/dylanc/longan/ActivityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/dylanc/longan/ActivityKt;->a:Ljava/util/LinkedList;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(Ljava/lang/Class;)Z
    .locals 2

    .line 1
    const-string v0, "clazz"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/dylanc/longan/ActivityKt;->a:Ljava/util/LinkedList;

    .line 7
    .line 8
    new-instance v1, Lcom/dylanc/longan/ActivityKt$finishActivity$1;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/dylanc/longan/ActivityKt$finishActivity$1;-><init>(Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static final b()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/dylanc/longan/ActivityKt;->a:Ljava/util/LinkedList;

    .line 2
    .line 3
    sget-object v1, Lcom/dylanc/longan/ActivityKt$finishAllActivities$1;->a:Lcom/dylanc/longan/ActivityKt$finishAllActivities$1;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public static final c()Ljava/util/LinkedList;
    .locals 1

    .line 1
    sget-object v0, Lcom/dylanc/longan/ActivityKt;->a:Ljava/util/LinkedList;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final d(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "permission"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method
