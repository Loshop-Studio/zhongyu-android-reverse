.class public final synthetic Lh4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Lcom/friday/user/view/PersonalInfoFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/user/view/PersonalInfoFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/m;->c:Lcom/friday/user/view/PersonalInfoFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/m;->c:Lcom/friday/user/view/PersonalInfoFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/friday/user/view/PersonalInfoFragment;->q(Lcom/friday/user/view/PersonalInfoFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
