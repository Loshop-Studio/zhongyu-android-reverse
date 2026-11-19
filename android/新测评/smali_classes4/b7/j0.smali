.class public final synthetic Lb7/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Lv6/w;

.field public final synthetic c:I

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Landroidx/lifecycle/LifecycleOwner;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lv6/w;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/LifecycleOwner;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/j0;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lb7/j0;->b:Lv6/w;

    iput p3, p0, Lb7/j0;->c:I

    iput-object p4, p0, Lb7/j0;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lb7/j0;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lb7/j0;->f:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lb7/j0;->g:Landroidx/lifecycle/LifecycleOwner;

    iput p8, p0, Lb7/j0;->h:I

    iput p9, p0, Lb7/j0;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lb7/j0;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lb7/j0;->b:Lv6/w;

    iget v2, p0, Lb7/j0;->c:I

    iget-object v3, p0, Lb7/j0;->d:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lb7/j0;->e:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lb7/j0;->f:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lb7/j0;->g:Landroidx/lifecycle/LifecycleOwner;

    iget v7, p0, Lb7/j0;->h:I

    iget v8, p0, Lb7/j0;->i:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->p(Landroidx/compose/ui/Modifier;Lv6/w;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/LifecycleOwner;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
