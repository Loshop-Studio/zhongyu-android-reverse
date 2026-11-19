.class public final synthetic Lv3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/DBActivity;

.field public final synthetic d:Lcom/friday/main/viewmodel/DbViewModel;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/DBActivity;Lcom/friday/main/viewmodel/DbViewModel;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/l;->c:Lcom/friday/main/view/DBActivity;

    iput-object p2, p0, Lv3/l;->d:Lcom/friday/main/viewmodel/DbViewModel;

    iput p3, p0, Lv3/l;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lv3/l;->c:Lcom/friday/main/view/DBActivity;

    iget-object v1, p0, Lv3/l;->d:Lcom/friday/main/viewmodel/DbViewModel;

    iget v2, p0, Lv3/l;->e:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/friday/main/view/DBActivity;->g0(Lcom/friday/main/view/DBActivity;Lcom/friday/main/viewmodel/DbViewModel;ILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
