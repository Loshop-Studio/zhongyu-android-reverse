.class public final synthetic Lh4/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Lcom/friday/user/view/PersonalInfoFragment;

.field public final synthetic d:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/user/view/PersonalInfoFragment;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/n;->c:Lcom/friday/user/view/PersonalInfoFragment;

    iput-object p2, p0, Lh4/n;->d:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lh4/n;->c:Lcom/friday/user/view/PersonalInfoFragment;

    iget-object v1, p0, Lh4/n;->d:Landroidx/compose/runtime/State;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/friday/user/view/PersonalInfoFragment;->t(Lcom/friday/user/view/PersonalInfoFragment;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
