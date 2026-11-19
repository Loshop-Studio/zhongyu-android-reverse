.class public final synthetic Li6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Li6/l;

.field public final synthetic c:Ljava/util/Set;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Li6/l;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/o;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Li6/o;->b:Li6/l;

    iput-object p3, p0, Li6/o;->c:Ljava/util/Set;

    iput-object p4, p0, Li6/o;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Li6/o;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Li6/o;->f:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Li6/o;->g:I

    iput p8, p0, Li6/o;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Li6/o;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Li6/o;->b:Li6/l;

    iget-object v2, p0, Li6/o;->c:Ljava/util/Set;

    iget-object v3, p0, Li6/o;->d:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Li6/o;->e:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Li6/o;->f:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Li6/o;->g:I

    iget v7, p0, Li6/o;->h:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Li6/k0;->u(Landroidx/compose/ui/Modifier;Li6/l;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
