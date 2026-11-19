.class public final synthetic Lw5/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Landroidx/compose/foundation/ScrollState;

.field public final synthetic c:Lw5/e;

.field public final synthetic d:Lkotlin/jvm/functions/Function3;

.field public final synthetic e:Lkotlin/jvm/functions/Function2;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:Lkotlin/jvm/functions/Function2;

.field public final synthetic i:Lkotlin/jvm/functions/Function2;

.field public final synthetic j:Lkotlin/jvm/functions/Function2;

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lw5/e;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/k0;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lw5/k0;->b:Landroidx/compose/foundation/ScrollState;

    iput-object p3, p0, Lw5/k0;->c:Lw5/e;

    iput-object p4, p0, Lw5/k0;->d:Lkotlin/jvm/functions/Function3;

    iput-object p5, p0, Lw5/k0;->e:Lkotlin/jvm/functions/Function2;

    iput-object p6, p0, Lw5/k0;->f:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lw5/k0;->g:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lw5/k0;->h:Lkotlin/jvm/functions/Function2;

    iput-object p9, p0, Lw5/k0;->i:Lkotlin/jvm/functions/Function2;

    iput-object p10, p0, Lw5/k0;->j:Lkotlin/jvm/functions/Function2;

    iput p11, p0, Lw5/k0;->k:I

    iput p12, p0, Lw5/k0;->l:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, Lw5/k0;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lw5/k0;->b:Landroidx/compose/foundation/ScrollState;

    iget-object v2, p0, Lw5/k0;->c:Lw5/e;

    iget-object v3, p0, Lw5/k0;->d:Lkotlin/jvm/functions/Function3;

    iget-object v4, p0, Lw5/k0;->e:Lkotlin/jvm/functions/Function2;

    iget-object v5, p0, Lw5/k0;->f:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lw5/k0;->g:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lw5/k0;->h:Lkotlin/jvm/functions/Function2;

    iget-object v8, p0, Lw5/k0;->i:Lkotlin/jvm/functions/Function2;

    iget-object v9, p0, Lw5/k0;->j:Lkotlin/jvm/functions/Function2;

    iget v10, p0, Lw5/k0;->k:I

    iget v11, p0, Lw5/k0;->l:I

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static/range {v0 .. v13}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->b(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lw5/e;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
