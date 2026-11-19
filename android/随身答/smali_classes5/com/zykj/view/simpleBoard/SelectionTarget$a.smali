.class public final Lcom/zykj/view/simpleBoard/SelectionTarget$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/simpleBoard/SelectionTarget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/simpleBoard/SelectionTarget$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/zykj/view/simpleBoard/SelectionTarget;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/view/simpleBoard/SelectionTarget;->values()[Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/zykj/view/simpleBoard/SelectionTarget;->q:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v1, p1

    .line 12
    if-ltz v1, :cond_0

    .line 13
    .line 14
    array-length p1, v0

    .line 15
    if-ge v1, p1, :cond_0

    .line 16
    .line 17
    aget-object p1, v0, v1

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lcom/zykj/view/simpleBoard/SelectionTarget;->c:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 21
    .line 22
    return-object p1
.end method

.method public final b()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/simpleBoard/SelectionTarget;->c()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final c(I)Lcom/zykj/view/simpleBoard/SelectionTarget;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/view/simpleBoard/SelectionTarget;->values()[Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/zykj/view/simpleBoard/SelectionTarget;->v:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v1, p1

    .line 12
    if-ltz v1, :cond_0

    .line 13
    .line 14
    array-length p1, v0

    .line 15
    if-ge v1, p1, :cond_0

    .line 16
    .line 17
    aget-object p1, v0, v1

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lcom/zykj/view/simpleBoard/SelectionTarget;->c:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 21
    .line 22
    return-object p1
.end method
