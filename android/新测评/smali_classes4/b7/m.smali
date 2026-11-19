.class public final synthetic Lb7/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/LifecycleOwner;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lb7/l;

.field public final synthetic d:Lkotlin/jvm/internal/Ref$BooleanRef;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/LifecycleOwner;Landroid/content/Context;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/m;->a:Landroidx/lifecycle/LifecycleOwner;

    iput-object p2, p0, Lb7/m;->b:Landroid/content/Context;

    iput-object p3, p0, Lb7/m;->c:Lb7/l;

    iput-object p4, p0, Lb7/m;->d:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-object p5, p0, Lb7/m;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lb7/m;->a:Landroidx/lifecycle/LifecycleOwner;

    iget-object v1, p0, Lb7/m;->b:Landroid/content/Context;

    iget-object v2, p0, Lb7/m;->c:Lb7/l;

    iget-object v3, p0, Lb7/m;->d:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v4, p0, Lb7/m;->e:Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->z(Landroidx/lifecycle/LifecycleOwner;Landroid/content/Context;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method
