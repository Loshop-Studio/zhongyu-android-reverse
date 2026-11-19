.class public final synthetic Lh4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Lcom/friday/user/view/PersonalInfoFragment;

.field public final synthetic d:Lcom/friday/user/viewmodel/UserViewModel;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Lcom/friday/user/view/PersonalInfoFragment;Lcom/friday/user/viewmodel/UserViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/o;->c:Lcom/friday/user/view/PersonalInfoFragment;

    iput-object p2, p0, Lh4/o;->d:Lcom/friday/user/viewmodel/UserViewModel;

    iput p3, p0, Lh4/o;->e:I

    iput p4, p0, Lh4/o;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lh4/o;->c:Lcom/friday/user/view/PersonalInfoFragment;

    iget-object v1, p0, Lh4/o;->d:Lcom/friday/user/viewmodel/UserViewModel;

    iget v2, p0, Lh4/o;->e:I

    iget v3, p0, Lh4/o;->f:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/friday/user/view/PersonalInfoFragment;->s(Lcom/friday/user/view/PersonalInfoFragment;Lcom/friday/user/viewmodel/UserViewModel;IILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
