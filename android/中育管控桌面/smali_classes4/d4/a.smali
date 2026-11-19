.class public final synthetic Ld4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function0;

.field public final synthetic b:Landroidx/compose/foundation/ScrollState;

.field public final synthetic c:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

.field public final synthetic d:Landroidx/compose/ui/focus/FocusRequester;

.field public final synthetic e:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/ScrollState;Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld4/a;->a:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Ld4/a;->b:Landroidx/compose/foundation/ScrollState;

    iput-object p3, p0, Ld4/a;->c:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

    iput-object p4, p0, Ld4/a;->d:Landroidx/compose/ui/focus/FocusRequester;

    iput-object p5, p0, Ld4/a;->e:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Ld4/a;->a:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Ld4/a;->b:Landroidx/compose/foundation/ScrollState;

    iget-object v2, p0, Ld4/a;->c:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

    iget-object v3, p0, Ld4/a;->d:Landroidx/compose/ui/focus/FocusRequester;

    iget-object v4, p0, Ld4/a;->e:Landroidx/compose/runtime/State;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->f(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/ScrollState;Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
