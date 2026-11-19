.class public final synthetic Lcom/zykj/mistake/feature/collection/component/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Ljava/util/Set;

.field public final synthetic e:Z

.field public final synthetic f:Ljava/util/Set;

.field public final synthetic g:Lr6/c;

.field public final synthetic h:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ZZLjava/util/Set;ZLjava/util/Set;Lr6/c;Lr6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/i;->a:Ljava/util/List;

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/collection/component/i;->b:Z

    iput-boolean p3, p0, Lcom/zykj/mistake/feature/collection/component/i;->c:Z

    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/component/i;->d:Ljava/util/Set;

    iput-boolean p5, p0, Lcom/zykj/mistake/feature/collection/component/i;->e:Z

    iput-object p6, p0, Lcom/zykj/mistake/feature/collection/component/i;->f:Ljava/util/Set;

    iput-object p7, p0, Lcom/zykj/mistake/feature/collection/component/i;->g:Lr6/c;

    iput-object p8, p0, Lcom/zykj/mistake/feature/collection/component/i;->h:Lr6/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Landroidx/compose/foundation/lazy/grid/LazyGridScope;

    .line 3
    .line 4
    const-string p1, "$this$LazyVerticalGrid"

    .line 5
    .line 6
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Landroidx/navigation/a;

    .line 10
    .line 11
    const/16 v1, 0x1d

    .line 12
    .line 13
    invoke-direct {p1, v1}, Landroidx/navigation/a;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$1;->INSTANCE:Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$1;

    .line 17
    .line 18
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/component/i;->a:Ljava/util/List;

    .line 19
    .line 20
    move-object v2, v1

    .line 21
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    new-instance v9, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$2;

    .line 26
    .line 27
    invoke-direct {v9, p1, v3}, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$2;-><init>(Lr6/c;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$4;

    .line 31
    .line 32
    invoke-direct {p1, v2, v3}, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$4;-><init>(Lr6/c;Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;

    .line 36
    .line 37
    iget-object v4, p0, Lcom/zykj/mistake/feature/collection/component/i;->d:Ljava/util/Set;

    .line 38
    .line 39
    iget-boolean v5, p0, Lcom/zykj/mistake/feature/collection/component/i;->e:Z

    .line 40
    .line 41
    iget-object v6, p0, Lcom/zykj/mistake/feature/collection/component/i;->f:Ljava/util/Set;

    .line 42
    .line 43
    iget-object v7, p0, Lcom/zykj/mistake/feature/collection/component/i;->g:Lr6/c;

    .line 44
    .line 45
    iget-object v8, p0, Lcom/zykj/mistake/feature/collection/component/i;->h:Lr6/c;

    .line 46
    .line 47
    invoke-direct/range {v2 .. v8}, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;-><init>(Ljava/util/List;Ljava/util/Set;ZLjava/util/Set;Lr6/c;Lr6/c;)V

    .line 48
    .line 49
    .line 50
    const v3, 0x29b3c0fe

    .line 51
    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    invoke-static {v3, v6, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    const/4 v3, 0x0

    .line 59
    move-object v4, p1

    .line 60
    move-object v2, v9

    .line 61
    invoke-interface/range {v0 .. v5}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILr6/c;Lr6/e;Lr6/c;Lr6/g;)V

    .line 62
    .line 63
    .line 64
    iget-boolean p1, p0, Lcom/zykj/mistake/feature/collection/component/i;->b:Z

    .line 65
    .line 66
    if-nez p1, :cond_0

    .line 67
    .line 68
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/component/i;->c:Z

    .line 69
    .line 70
    if-nez v1, :cond_1

    .line 71
    .line 72
    :cond_0
    new-instance v2, Lcom/zykj/mistake/feature/collection/component/j;

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-direct {v2, v1}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 76
    .line 77
    .line 78
    new-instance v1, Lcom/zykj/mistake/feature/collection/component/k;

    .line 79
    .line 80
    invoke-direct {v1, p1}, Lcom/zykj/mistake/feature/collection/component/k;-><init>(Z)V

    .line 81
    .line 82
    .line 83
    const p1, -0x5f9369ab

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v6, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    const/4 v5, 0x5

    .line 91
    const/4 v6, 0x0

    .line 92
    const/4 v1, 0x0

    .line 93
    const/4 v3, 0x0

    .line 94
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->item$default(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/lang/Object;Lr6/c;Ljava/lang/Object;Lr6/f;ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 98
    .line 99
    return-object p1
.end method
