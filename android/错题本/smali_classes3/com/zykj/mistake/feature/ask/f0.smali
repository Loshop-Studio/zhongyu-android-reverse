.class public final synthetic Lcom/zykj/mistake/feature/ask/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/feature/ask/n;

.field public final synthetic b:F

.field public final synthetic c:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/ask/n;FLr6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/f0;->a:Lcom/zykj/mistake/feature/ask/n;

    iput p2, p0, Lcom/zykj/mistake/feature/ask/f0;->b:F

    iput-object p3, p0, Lcom/zykj/mistake/feature/ask/f0;->c:Lr6/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

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
    iget-object p1, p0, Lcom/zykj/mistake/feature/ask/f0;->a:Lcom/zykj/mistake/feature/ask/n;

    .line 10
    .line 11
    iget-object v1, p1, Lcom/zykj/mistake/feature/ask/n;->e:Ljava/util/List;

    .line 12
    .line 13
    new-instance v2, Landroidx/navigation/a;

    .line 14
    .line 15
    const/16 v3, 0x1b

    .line 16
    .line 17
    invoke-direct {v2, v3}, Landroidx/navigation/a;-><init>(I)V

    .line 18
    .line 19
    .line 20
    sget-object v3, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$1;->INSTANCE:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$1;

    .line 21
    .line 22
    move-object v4, v1

    .line 23
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    move-object v5, v2

    .line 28
    new-instance v2, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$2;

    .line 29
    .line 30
    invoke-direct {v2, v5, v4}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$2;-><init>(Lr6/c;Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    move-object v5, v4

    .line 34
    new-instance v4, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$4;

    .line 35
    .line 36
    invoke-direct {v4, v3, v5}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$4;-><init>(Lr6/c;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    new-instance v3, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$5;

    .line 40
    .line 41
    iget v6, p0, Lcom/zykj/mistake/feature/ask/f0;->b:F

    .line 42
    .line 43
    iget-object v7, p0, Lcom/zykj/mistake/feature/ask/f0;->c:Lr6/c;

    .line 44
    .line 45
    invoke-direct {v3, v5, p1, v6, v7}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$29$lambda$28$lambda$27$$inlined$items$default$5;-><init>(Ljava/util/List;Lcom/zykj/mistake/feature/ask/n;FLr6/c;)V

    .line 46
    .line 47
    .line 48
    const p1, 0x29b3c0fe

    .line 49
    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    invoke-static {p1, v5, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-interface/range {v0 .. v5}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILr6/c;Lr6/e;Lr6/c;Lr6/g;)V

    .line 58
    .line 59
    .line 60
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 61
    .line 62
    return-object p1
.end method
