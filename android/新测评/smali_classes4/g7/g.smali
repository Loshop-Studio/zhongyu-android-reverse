.class public final synthetic Lg7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field public final synthetic b:Landroidx/compose/foundation/Indication;

.field public final synthetic c:Z

.field public final synthetic d:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg7/g;->a:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-object p2, p0, Lg7/g;->b:Landroidx/compose/foundation/Indication;

    iput-boolean p3, p0, Lg7/g;->c:Z

    iput-object p4, p0, Lg7/g;->d:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lg7/g;->a:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget-object v1, p0, Lg7/g;->b:Landroidx/compose/foundation/Indication;

    iget-boolean v2, p0, Lg7/g;->c:Z

    iget-object v3, p0, Lg7/g;->d:Lkotlin/jvm/functions/Function0;

    move-object v4, p1

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lg7/i;->c(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method
