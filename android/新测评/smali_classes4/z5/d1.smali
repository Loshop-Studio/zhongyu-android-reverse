.class public final synthetic Lz5/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:Landroidx/compose/runtime/State;

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;Landroidx/compose/runtime/State;Landroid/content/Context;Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/d1;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lz5/d1;->b:Landroidx/navigation/NavController;

    iput-object p3, p0, Lz5/d1;->c:Landroidx/compose/runtime/State;

    iput-object p4, p0, Lz5/d1;->d:Landroid/content/Context;

    iput-object p5, p0, Lz5/d1;->e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lz5/d1;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lz5/d1;->b:Landroidx/navigation/NavController;

    iget-object v2, p0, Lz5/d1;->c:Landroidx/compose/runtime/State;

    iget-object v3, p0, Lz5/d1;->d:Landroid/content/Context;

    iget-object v4, p0, Lz5/d1;->e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/ui/detail/mistake/MistakePageKt;->b(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;Landroidx/compose/runtime/State;Landroid/content/Context;Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
