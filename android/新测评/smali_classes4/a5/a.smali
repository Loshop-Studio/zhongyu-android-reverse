.class public abstract La5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/SelectGraphEnum;->a:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/blackboard/enums/SelectGraphEnum;->b:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 4
    .line 5
    sget-object v2, Lcom/zykj/blackboard/enums/SelectGraphEnum;->c:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 6
    .line 7
    sget-object v3, Lcom/zykj/blackboard/enums/SelectGraphEnum;->d:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 8
    .line 9
    sget-object v4, Lcom/zykj/blackboard/enums/SelectGraphEnum;->e:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, La5/a;->a:Ljava/util/List;

    .line 20
    .line 21
    return-void
.end method

.method public static final a(Lq4/c;)Lcom/zykj/blackboard/enums/SelectGraphEnum;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lcom/zykj/blackboard/enums/SelectGraphEnum;->c:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    instance-of v0, p0, Lr4/b;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    sget-object p0, Lcom/zykj/blackboard/enums/SelectGraphEnum;->e:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    instance-of v0, p0, Lr4/d;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    sget-object p0, Lcom/zykj/blackboard/enums/SelectGraphEnum;->d:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    invoke-interface {p0}, Lq4/c;->f()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lq4/c;

    .line 55
    .line 56
    instance-of v1, v0, Lt4/b;

    .line 57
    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    check-cast v0, Lt4/b;

    .line 61
    .line 62
    invoke-virtual {v0}, Lt4/c;->I()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    sget-object p0, Lcom/zykj/blackboard/enums/SelectGraphEnum;->a:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_5
    :goto_1
    sget-object p0, Lcom/zykj/blackboard/enums/SelectGraphEnum;->b:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 73
    .line 74
    return-object p0
.end method

.method public static final b()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, La5/a;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
